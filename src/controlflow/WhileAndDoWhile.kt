package controlflow

/*
While

Untuk menggunakan While, kita membutuhkan kata kunci while, lanjut ke kondisi di dalam tanda kurung,
dan diakhiri oleh blok body dari while itu sendiri.
 */

fun main() {
    var counter = 1
    while (counter <= 7){
        println("Hello, World!")
        counter++
        println()
        doWhile()
    }
}
/*
   output :
       Hello, World!
       Hello, World!
       Hello, World!
       Hello, World!
       Hello, World!
       Hello, World!
       Hello, World!
*/

/*
Do While

Selain menggunakan While, kita juga bisa menggunakan Do While untuk melakukan perulangan
 */

fun doWhile() {
    var counter = 1
    do {
        println("Hello, World!")
        counter++
    } while (counter <= 7)
}

/*
   output:
       Hello, World!
       Hello, World!
       Hello, World!
       Hello, World!
       Hello, World!
       Hello, World!
       Hello, World!
*/