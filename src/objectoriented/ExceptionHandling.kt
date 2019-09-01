package objectoriented

/*
Kode yang baik yaitu kode yang terhindar dari segala bentuk kejadian dengan efek buruk pada aplikasi kita.
Kejadian tersebut pada programming disebut Exception.

Exception adalah event (kejadian) yang dapat mengacaukan jalannya suatu program.
Pada Kotlin semua exception bersifat Unchecked, yang artinya exception terjadi karena kesalahan pada kode kita.

contoh Unchecked Exception yang sering mengganggu jalannya program kita:

ArithmeticException
NumberFormatException
NullPointerException
 */

/*
ArithmeticException merupakan exception yang terjadi karena kita membagi suatu bilangan dengan nilai nol.
 */

fun main() {
    val someValue = 6
    println(someValue / 0)

    println()
    mainExcept1()
    mainExcept2()
}

/*
output:
    Exception in thread "main" java.lang.ArithmeticException: / by zero
*/

// ------- //

/*
NumberFormatException disebabkan karena terjadi kesalahan dalam format angka.
Sebagai contoh, kita akan mengubah sebuah nilai String menjadi Integer
tetapi nilai String yang akan kita ubah tidak memiliki format angka yang benar, sehingga dapat membangkitkan NumberFormatException.
 */

fun mainExcept1() {
    val someStringValue = "18.0"
    println(someStringValue.toInt())
}

/*
output:
    Exception in thread "main" java.lang.NumberFormatException: For input string: "18.0"
*/

// ------- //

/*
NullPointerException atau NPE. Walaupun Kotlin memiliki operator Null Safety,
NPE tetap bisa saja terjadi. NPE terjadi karena sebuah variabel atau objek memiliki nilai null,
padahal seharusnya objek atau variabel tersebut tidak boleh null.
 */

fun mainExcept2() {
    val someNullValue: String? = null
    val someMustNotNullValue: String = someNullValue!!
    println(someMustNotNullValue)
}

/*
output:
    Exception in thread "main" kotlin.NullPointerException at MainKt.main(Main.kt:3)
*/

