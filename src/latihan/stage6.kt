package latihan

/*
TODO 1 :
Buatlah fungsi generics baru dengan ketentuan sebagai berikut:
Nama fungsi adalah getResult.
Memiliki satu tipe parameter.
Jika argumen yang dilampirkan bertipe Int, maka nilai yang dikembalikan adalah nilai argumen yang dikalikan 5.
Jika argumen yang dilampirkan bertipe String, maka nilai yang dikembalikan adalah panjang karakter.
Jika argumen yang dilampirkan bertipe selain Int dan String, maka nilai yang dikembalikan adalah 0.

TODO 2 :
Tambahkan fungsi untuk mencetak nilai dari variable stringResult dan intResult pada konsol.
 */

fun main() {
    val stringResult = getResult("Kotlin")
    val intResult = getResult(100)

    // TODO 2
    println(stringResult)
    println(intResult)
}

// TODO 1
fun <T> getResult(args: T): Int {
    return when (args) {
        is String -> args.length
        is Int -> args * 5
        else -> 0
    }
}