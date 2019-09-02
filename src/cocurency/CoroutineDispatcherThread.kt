package cocurency

import kotlinx.coroutines.*

fun main() {
    mainSingleThread()
    mainThreadPool()
}

/*
Single Thread Context

Dispatcher ini menjamin bahwa setiap saat coroutine akan dijalankan pada thread yang Anda tentukan.
 */

fun mainSingleThread() = runBlocking<Unit> {
    val dispatcher = newSingleThreadContext("myThread")
    launch(dispatcher) {
        println("Starting in ${Thread.currentThread().name}")
        delay(1000)
        println("Resuming in ${Thread.currentThread().name}")
    }.start()
}

/*
output :

Starting in myThread
Resuming in myThread
 */

// ========== //

/*
Thread Pool

Sebuah dispatcher yang memiliki kumpulan thread.
Ia akan memulai dan melanjutkan coroutine di salah satu thread yang tersedia pada kumpulan tersebut.
 */

fun mainThreadPool() = runBlocking<Unit> {
    val dispatcher = newFixedThreadPoolContext(3, "myPool")

    launch(dispatcher) {
        println("Starting in ${Thread.currentThread().name}")
        delay(1000)
        println("Resuming in ${Thread.currentThread().name}")
    }.start()
}

/*
output :

Starting in myPool-1
Resuming in myPool-2
 */