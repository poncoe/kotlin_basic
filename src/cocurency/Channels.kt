package cocurency

/*
Channels adalah nilai deferred yang menyediakan cara mudah untuk mentransfer nilai tunggal antara coroutine.
 */

import kotlinx.coroutines.*
import kotlinx.coroutines.channels.Channel

/*
pada coroutine v1coroutine bahwa channels telah mengirimkan nilai dari hasil komputasi dengan menggunakan fungsi send.
Setelah itu, di coroutine lain (main) channel menerima nilai dengan menggunakan fungsi receive.

channels memungkinkan komunikasi yang aman antar kode concurrent.
Ia membuat kode concurrent dapat berkomunikasi dengan mengirim dan menerima
pesan tanpa harus peduli di thread mana coroutine berjalan.
 */

fun main() = runBlocking(CoroutineName("main")) {
    val channel = Channel<Int>()
    launch(CoroutineName("v1coroutine")){
        println("Sending from ${Thread.currentThread().name}")
        for (x in 1..5) channel.send(x * x)
    }

    repeat(5) { println(channel.receive()) }
    println("received in ${Thread.currentThread().name}")
}

/*
output :

Sending from main @v1coroutine#2
1
4
9
16
25
received in main @main#1
 */