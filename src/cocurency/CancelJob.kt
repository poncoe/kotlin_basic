package cocurency

import kotlinx.coroutines.*

@InternalCoroutinesApi
fun main() {
    cancelJob1()
    cancelJob2()
}

/*
Hanya job yang sedang aktif yang dapat dibatalkan. Anda bisa melakukannya dengan memanggil fungsi cancel()
 */

fun cancelJob1() = runBlocking {
    val job = launch {
        delay(5000)
        println("Start new job!")
    }

/*
sebuah job membutuhkan waktu 5 detik untuk dijalankan. Namun ketika mencapai waktu 2 detik,
job tersebut telah dibatalkan. Saat fungsi cancel() dipanggil, job akan memasuki state Cancelling
sampai pembatalan tersebut berhasil. Kemudian setelah pembatalan berhasil, job akan memiliki state Cancelled dan Completed.
 */

    delay(2000)
    job.cancel()
    println("Cancelling job...")
    if (job.isCancelled) {
        println("Job is cancelled")
    }
}

/*
CancellationException akan mengirimkan nilainya sebagai pengecualian dari job tersebut.
Kita pun bisa mengakses nilai tersebut dengan fungsi getCancellationException.
Karena getCancellationException masih tahap eksperimen, Anda perlu menambahkan anotasi @InternalCoroutinesApi.
 */

@InternalCoroutinesApi
fun cancelJob2() = runBlocking {
    val job = launch {
        delay(5000)
        println("Start new job!")
    }

    delay(2000)
    job.cancel(cause = CancellationException("time is up!"))
    println("Cancelling job...")
    if (job.isCancelled) {
        println("Job is cancelled because ${job.getCancellationException().message}")
    }
}

/*
output :

Cancelling job...
Job is cancelled because time is up!
 */