package functionalprogramming

/*
Pada dasarnya sebuah lambda yang mempunyai receiver mirip seperti extension functions,
yang memungkinkan kita untuk mengakses anggota objek receiver dari dalam extension.
Pada lambda, receiver ditentukan pada saat menentukan tipe deklarasi.
 */

fun main() {
    val message = buildString {
        append("Hello ")
        append("from ")
        append("lambda ")
    }

    println(message)
}

/*
StringBuilder dijadikan sebagai receiver untuk tipe deklarasi parameter action.
Dengan begitu kita dapat memanggil parameter action tersebut dari variabel yang bertipekan StringBuilder
 */

fun buildString(action: StringBuilder.() -> Unit): String {
    val stringBuilder = StringBuilder()
    stringBuilder.action()
    return stringBuilder.toString()
}

/*
   output : Hello from lambda
*/