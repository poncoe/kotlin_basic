package functionalprogramming

/*
Lambda expression, biasa disebut dengan anonymous function atau function literal
adalah fitur yang cukup populer sampai sekarang dalam dunia functional programming.
Bisa disebut sebagai anonymous karena lambda tidak memiliki sebuah nama seperti halnya sebuah fungsi pada umumnya.
Karena merupakan sebuah fungsi, lambda juga dapat memiliki daftar parameter, body dan return type.
Istilah lambda sendiri berasal dari istilah akademis lambda calculus yang digunakan untuk menggambarkan proses komputasi.
 */

fun main() {
    val length = messageLength("Hello From lambda")
    printMessage("Hello From Lambda")
    println("Message length $length")
}

val messageLength = { message: String -> message.length }
val printMessage = { message: String -> println(message) }

/*
   output : Message length 17
   output : Hello From Lambda
*/