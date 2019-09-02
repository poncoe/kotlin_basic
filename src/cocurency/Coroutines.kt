package cocurency

/*
import library corountines
 */

import kotlinx.coroutines.*

/*
fungsi runBlocking untuk memulai coroutine utama dan launch untuk menjalankan coroutine baru.
 */

fun main() = runBlocking{
    launch {

        /*
        Fungsi delay(1000L) di dalam launch digunakan untuk menunda kode berikutnya selama 1 detik.
        delay adalah fungsi yang spesial pada coroutines.
        Ia merupakan sebuah suspending function yang tidak akan memblokir sebuah thread.

        Selama proses penundaan tersebut, main thread akan terus berjalan sehingga fungsi println("Hello,")
        akan langsung dijalankan. Setelah 1 detik, baru fungsi println("Coroutines!") akan dijalankan.
         */

        delay(1000L)
        println("Coroutines!")
    }
    println("Hello,")

    /*
    delay(2000L) digunakan untuk menunda selama 2 detik sebelum JVM berakhir.
    Tanpa kode ini, JVM akan langsung berhenti ketika kode terakhir dijalankan,
    sehingga kode di dalam launch tidak akan pernah dijalankan.
     */

    delay(2000L)
}