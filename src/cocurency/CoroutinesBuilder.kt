package cocurency

/*
import library
 */

import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

/*
delay pada kedua fungsi tersebut adalah waktu yang dibutuhkan untuk melakukan operasi sebelum hasilnya didapatkan.
 */

suspend fun getCapital(): Int {
    delay(1000L)
    return 50000
}

suspend fun getIncome(): Int {
    delay(1000L)
    return 75000
}

/*
fungsi getCapital dan getIncome di dalam async. Maka async akan mengembalikan hasil dari masing-masing fungsi.
Lalu untuk mengakses hasil tersebut, kita perlu menggunakan fungsi await.
 */

fun main() = runBlocking {
    val timeOne = measureTimeMillis {
        val capital = getCapital()
        val income = getIncome()
        println("Your profit is ${income - capital}")
    }

    val timeTwo = measureTimeMillis {
        val capital = async { getCapital() }
        val income = async { getIncome() }
        println("Your profit is ${income.await() - capital.await()}")
    }

    println("Completed in $timeOne ms vs $timeTwo ms")

}

/*
Your profit is 25000
Your profit is 25000
Completed in 2013 ms vs 1025 ms

async bisa selesai hampir 2 kali lebih cepat dibandingkan tanpa async
 */