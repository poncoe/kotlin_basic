package latihan

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

/*
TODO 1:
Ubahlah menjadi suspend function dengan ketentuan sebagai berikut:
Memiliki waktu tunggu 3 detik sebelum operasi selanjutnya berjalan.
Mengembalikan nilai hasil penjumlahan valueA dan valueB.

TODO 2:
Ubahlah menjadi suspend function dengan ketentuan sebagai berikut:
Memiliki waktu tunggu 2 detik sebelum operasi selanjutnya berjalan.
Mengembalikan nilai hasil perkalian valueA dan valueB.

TODO 3:
Tambahkan fungsi untuk mencetak nilai tangguhan dari variable resultSum dan resultMultiple pada konsol.

Jika dijalankan, pada konsol akan menampilkan teks:
Counting...
Result sum: 20
Result multiple: 400
 */

// TODO 1
suspend fun sum(valueA: Int, valueB: Int): Int {
    delay(3000)
    return valueA + valueB
}

// TODO 2
suspend fun multiple(valueA: Int, valueB: Int): Int {
    delay(2000)
    return valueA * valueB
}

fun main() = runBlocking {

    println("Counting...")

    val resultSum = async { sum(10, 10) }
    val resultMultiple = async { multiple(20, 20) }

    // TODO 3
    println("Result sum: ${resultSum.await()}\n" +
            "Result multiple: ${resultMultiple.await()}")
}