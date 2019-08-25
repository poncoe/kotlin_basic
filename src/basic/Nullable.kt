package basic

/*
var a : String = "Kotlin"
a = null //kompilasi error

Secara default, Kotlin mengasumsikan nilai dari sebuah properti tidak boleh null.
Oleh karena itu, kode pada baris kedua akan langsung dianggap eror.
Namun seringkali kita tidak bisa menghindari bahwa sebuah data ternyata null,
apalagi ketika kita mengkonsumsi data yang didapatkan dari server.
Kita pun bisa menetapkan sebuah properti nullable dengan menambahkan tanda (?) pada tipe datanya.
 */

/*
var a : String? = "Kotlin"
a = null

Properti a sekarang bisa ditetapkan sebagai nullable,
dan untuk mengaksesnya kita perlu menerapkan sebuah mekanisme untuk menghindari kesalahan kompilasi.
 */

fun nullableType(){
   // val text1: String = null // compile time error

    // ---- //

    val text2: String? = null // ready to go

    // ---- //

    val text3: String? = null
   // val textLength = text3.length // compile time error

    // ---- //

    val text: String? = null

    //val textLength = text.length // compile time error

    if (text != null){
        val textLength = text.length // ready to go
    }
}