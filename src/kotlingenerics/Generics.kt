package kotlingenerics

/*
generic merupakan konsep yang digunakan untuk menentukan tipe data yang akan kita gunakan.
Pendeklarasiannya ditandai dengan tipe parameter.
 */

/*
Tipe parameter yang digunakan dalam pemanggilan fungsi listOf() adalah
String maka nilai yang bisa kita masukkan adalah nilai dengan tipe String.

val contributor = listOf<String>("kucing item","kucing kuning","kucing abu-abu","kucing putih")
val contributor = listOf("kucing item","kucing kuning","kucing abu-abu","kucing putih")
val contributor = listOf<String>()
val points = mapOf<String, Int>( "kucing item" to 10 , "kucing putih" to 20 )
 */

fun main() {
    val numbers = (1..100).toList()
    print(numbers.slice<Int>(1..10))
}

/*
   output : [2, 3, 4, 5, 6, 7, 8, 9, 10, 11]
*/