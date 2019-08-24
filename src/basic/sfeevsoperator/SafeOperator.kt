package basic.sfeevsoperator

/*
Safe calls operator (?.)

Yang pertama akan kita pelajari adalah Safe Calls.
Seperti namanya, safe call akan menjamin kode yang kita tulis aman dari NullPointerException.
Dalam menggunakan safe call, kita akan mengganti tanda titik (.) dengan tanda (?.)
saat mengakses atau mengelola nilai dari objek nullable.
 */

fun main(){
    val text: String? = null
    text?.length
}