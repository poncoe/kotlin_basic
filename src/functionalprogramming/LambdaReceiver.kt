package functionalprogramming

fun main(){
    mainRun()
    println()
    mainWith()
    println()
    mainApply()
}

/*
Lambda receiver (this)
fungsi yang menggunakan lambda receiver adalah run, with, dan apply.
Ketika ingin mengakses konteks dari sebuah objek, kita bisa saja tidak menuliskan atau menghilangkan kata kunci this.
 */

fun lamdaReceiver(){
    val buildString = StringBuilder().apply {
        append("Hello ")
        append("Kotlin ")
    }
}

// SCOPE FUNCTION //

/*
RUN

Fungsi run akan mengembalikan nilai berdasarkan expression yang berada di dalam blok lambda.
Untuk mengakses konteks dari objek, ia akan menggunakan receiver (this).
Fungsi run akan sangat berguna jika di dalam blok lambda terdapat inisialisasi objek dan perhitungan untuk nilai kembalian.
 */

fun mainRun() {
    val text = "Hello"
    val result = text.run {
        val from = this
        val to = this.replace("Hello", "Kotlin")
        "replace text from $from to $to"
    }
    println("result : $result")
}

/*
   output : result : replace text from Hello to Kotlin
*/

/*
WITH

Pada dasarnya fungsi with bukanlah sebuah extension melainkan hanyalah fungsi biasa.
Konteks objeknya disematkan sebagai argumen dan dari blok lambda diakses sebagai receiver.
 */

fun mainWith() {
    val message = "Hello Kotlin!"
    val result = with(message) {
        "First character is ${this[0]}" +
                " and last character is ${this[this.length - 1]}"
    }

    println(result)
}

/*
   output : First character is H and last character is !
*/

/*
APPLY

nilai yang dikembalikan dari fungsi apply adalah nilai dari konteks objeknya dan objek konteksnya tersedia sebagai receiver (this).
Baiknya fungsi apply dapat melakukan inisialisasi atau konfigurasi dari receiver-nya.
 */

fun mainApply() {
    val message = StringBuilder().apply {
        append("Hello ")
        append("Kotlin!")
    }

    println(message.toString())
}

/*
   output : Hello Kotlin
*/