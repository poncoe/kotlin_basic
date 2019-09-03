package latihan

/*
TODO 1 :
Buatlah fungsi getFirstAndLast yang menjadi ekstensi dari kelas String dengan tipe kembalian Map<String, Char>

TODO 2 :
Tambahkan fungsi untuk mencetak nilai dari variable firstChar dan lastChar pada konsol.
 */

fun main() {
    val text = "Kotlin".getFirstAndLast()

    val firstChar = text["first"]
    val lastChar = text["last"]

    // TODO 2
    println("$firstChar $lastChar")

}

// TODO 1
fun String.getFirstAndLast() = mapOf(
    Pair(first = "first", second = first()),
    Pair(first = "last", second = last())
)