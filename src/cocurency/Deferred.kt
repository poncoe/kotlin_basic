package cocurency

/*
nilai deferred juga merupakan sebuah job. Ia diciptakan dan dimulai pada saat coroutines mencapai state active.
 Bagaimanapun, fungsi async juga memiliki opsional parameter seperti CoroutineStart.LAZY untuk memulainya.
  Dengan begitu, deferred juga bisa diaktifkan saat fungsi start, join, atau await dipanggil.
 */

import kotlinx.coroutines.*

fun main() = runBlocking {

    /*
    capital dan income adalah contoh dari nilai deferred yang untuk mengaksesnya kita membutuhkan fungsi await.
     */

    val capital = async { getCapital() }
    val income = async { getIncome() }
    println("Your profit is ${income.await() - capital.await()}")
}