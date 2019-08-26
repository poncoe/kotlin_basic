package dataclassescollections

fun main(){
    println()
    sequences()
    println()
    asSequence()
    println()
    generateSequence()

}

/*
kita memiliki data collection sejumlah 1 juta item,
kemudian masing-masing data akan disaring berdasarkan angka yang merupakan kelipatan 5 lalu dikalikan 2 dan
akhirnya ditampilkan pada konsol.
 */

fun sequences(){
    val list = (1..1000000).toList()
    list.filter { it % 5 == 0 }.map { it * 2 }.forEach { println(it) }
}

/*
Untuk menerapkan lazy  atau vertical evaluation maka kita perlu mengubah list menjadi Sequence.
Caranya sangat sederhana, yaitu dengan memanggil fungsi asSequence()
 */

fun asSequence(){
    val list = (1..1000000).toList()
    list.asSequence().filter { it % 5 == 0 }.map { it + it }.forEach { println(it) }
}

/*
Untuk membuat objek Sequence, kita bisa menggunakan fungsi yang tersedia pada standard library yaitu generateSequence().
 */

fun generateSequence(){
    val sequenceNumber = generateSequence(1) { it + 1 }
    sequenceNumber.take(5).forEach { print("$it ") }
}
// Output: 1 2 3 4 5