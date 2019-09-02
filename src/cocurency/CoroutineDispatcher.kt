package cocurency

/*
kita harus mengetahui thread mana yang akan digunakan untuk menjalankan dan melanjutkan sebuah coroutine.
Untuk menentukannya kita membutuhkan sebuah base class bernama CoroutineDispatcher
 */

/*
Dispatcher.Default

Merupakan dispatcher dasar yang digunakan oleh semua standard builders seperti launch, async, dll
jika tidak ada dispatcher lain yang ditentukan.

launch(Dispatcher.Default){
    // TODO: Implement suspending lambda here
}
 */

// ===== //

/*
Dispatcher.IO

Sebuah dispatcher yang dapat digunakan untuk membongkar pemblokiran operasi I/O.
Ia akan menggunakan kumpulan thread yang dibuat berdasarkan permintaan.

launch(Dispatcher.IO){
    // TODO: Implement algorithm here
}
 */

// ===== //

/*
Dispatcher.Unconfined

Dispatcher ini akan menjalankan coroutines pada thread yang sedang berjalan sampai mencapai titik penangguhan.
 */

import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
    launch(Dispatchers.Unconfined) {
        println("Starting in ${Thread.currentThread().name}")
        delay(1000)
        println("Resuming in ${Thread.currentThread().name}")
    }.start()
}