package basic.numbers

/*
Di Kotlin kita tidak bisa melakukan konversi secara langsung.
Contoh, ketika ingin melakukan konversi dari tipe data Byte ke tipe data Int.

fun main() {
   val byteNumber: Byte = 1
   val intNumber: Int = byteNumber // compile error
}
 */


/*
toByte(): Byte
toShort(): Short
toInt(): Int
toLong(): Long
toFloat(): Float
toDouble(): Double
toChar(): Char
 */

fun main() {
    val stringNumber = "23"
    val intNumber = 3

    print(intNumber + stringNumber.toInt())

    println()
    println()

    contohKonversi()

    /*
     output: 26
     */
}

fun contohKonversi() {
    val byteNumber: Byte = 10
    val intNumber: Int = byteNumber.toInt() // ready to go
}