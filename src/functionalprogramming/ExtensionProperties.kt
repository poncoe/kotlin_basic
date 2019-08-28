package functionalprogramming

/*
extension properties. Seperti yang disebutkan di awal,
Kotlin juga mendukung extension untuk menambah sebuah properti baru pada sebuah
kelas tanpa harus menyentuh kode di dalam kelas tersebut.
 */

fun main() {
    println(10.slice)
}

val Int.slice: Int
    get() = this / 2

/*
   output : 5
*/