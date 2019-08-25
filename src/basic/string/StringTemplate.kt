package basic.string

fun main() {
    val name = "Poncoe"
    print("My name is " + name)

    println()
    println()

    mainTemplate1()

    println()
    println()

    mainTemplate2()

    println()
    println()

    mainTemplate3()

}
/*
   output : My name is Poncoe
*/

// ---- //

/*
Untuk menggunakan string template, kita hanya perlu menambahkan karakter $ sebelum nama variabel yang akan disisipkan
 */

fun mainTemplate1() {
    val name = "Poncoe"
    print("My name is $name")
}
/*
   output : My name is Poncoe
*/

// ---- //

/*
Variabel yang dapat disisipkan tidak sebatas String.
Kita juga bisa menyisipkan objek lain misal Int atau Double seperti berikut:
 */

fun mainTemplate2() {
    val name = "Poncoe"
    val old = 20
    print("My name is $name, im $old years old")
}
/*
   output : My name is Poncoe, im 20 years old
*/

// ---- //

/*
juga bisa menyisipkan sebuah expression ke dalam sebuah string template.
Caranya, sisipkan expression ke dalam curly braces yang diikuti karakter $.
 */

fun mainTemplate3() {
    val hour = 7
    print("Pet Shop ${if (hour > 7) "already close" else "is open"}")
}
/*
   output : Pet Shop is open
*/