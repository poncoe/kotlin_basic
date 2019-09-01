package objectoriented

/*
Kita bisa menggunakan fungsi reverse() untuk membuat urutan huruf disusun secara terbalik,
fungsi toUpperCase() yang dapat membuat huruf menjadi kapital atau fungsi toLowerCase() yang dapat membuat menjadi huruf kecil.
 */

fun main() {
    val someString = "Meonk"
    println(someString.reversed())
    println(someString.toUpperCase())
    println(someString.toLowerCase())
    println()
    main1()
}

/*
Output:
knoeM
MEONK
meonk
*/

/*
mengubah tipe data dengan mengakses fungsi yang tersedia dari sebuah objek String.
 */

fun main1() {
    val someString = "123"
    val someInt = someString.toInt()
    val someOtherString = "12.34"
    val someDouble = someOtherString.toDouble()

    println(someInt is Int)
    println(someDouble is Double)
}

/*
Output:

true
true
*/