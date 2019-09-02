package cocurency

/*
import library
 */

import kotlinx.coroutines.*

fun main() {
    main0()
    main1()
    main3()
    main4()
    main5()
}

//menggunakan launch():
fun main0() = runBlocking {
    val job = launch {
        // Do background task here
    }
}

//menggunakan Job():
fun main1() = runBlocking {
    val job = Job()
}

/*
membuat sebuah job tanpa langsung menjalankannya, bisa memanfaatkan CoroutineStart.LAZY
 */

fun main3() = runBlocking {
    val job = launch(start = CoroutineStart.LAZY) {
        TODO("Not implemented yet!")
    }
}

// menggunakan start()

fun main4() = runBlocking {
    val job = launch(start = CoroutineStart.LAZY) {
        delay(1000L)
        println("Start new job!")
    }

    job.start()
    println("Other task")
}

// menggunakan join()

fun main5() = runBlocking {
    val job = launch(start = CoroutineStart.LAZY) {
        delay(1000L)
        println("Start new job!")
    }

    job.join()
    println("Other task")
}

/*
Perbedaan dari keduanya adalah bahwa yang start() akan memulai job tanpa harus menunggu job tersebut selesai,
sedangkan join() akan menunda eksekusi sampai job selesai.
 */