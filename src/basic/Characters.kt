package basic

// Characters atau Karakter

/*
Tipe data Char hanya dapat kita gunakan untuk menyimpan karakter tunggal.
Sebaliknya jika kita memasukkan lebih dari 1 (satu) karakter, akan terjadi eror

contoh :

val character: Char = 'ABC'
 */

fun main() {
    var huruf = 'A'

    println("Huruf " + huruf++)
    println("Huruf " + huruf++)
    println("Huruf " + huruf++)
    println("Huruf " + huruf--)
    println("Huruf " + huruf--)
    println("Huruf " + huruf--)
    println("Huruf " + huruf--)
}

/*
   output:
       Huruf A
       Huruf B
       Huruf C
       Huruf D
       Huruf C
       Huruf B
       Huruf A
*/