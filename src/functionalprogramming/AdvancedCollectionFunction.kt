package functionalprogramming

fun main(){
    mainFold()
    println()
    mainDrop()
    println()
    mainTake()
    println()
    mainSlice()
    println()
    mainDistict()
    println()
    mainChunked()
}

/*
fungsi fold, kita bisa dengan mudah melakukan perhitungan setiap nilai yang berada di dalam sebuah collection tanpa harus melakukan iterasi item tersebut satu-persatu menggunakan fungsi fold().
 */

fun mainFold(){
    val numbers = listOf(1, 2, 3)
    val fold = numbers.fold(10) { current, item ->
        println("current $current")
        println("item $item")
        println()
        current + item
    }

    println("Fold result: $fold")

/*output:
       current 10
       item 1

       current 11
       item 2

       current 13
       item 3

       Fold result: 16
*/
}

/*
fungsi drop(), fungsi yang bisa kita manfaatkan untuk memangkas item yang berada di dalam sebuah objek collection berdasarkan jumlah yang kita tentukan.
 */

fun mainDrop(){
    val number = listOf(1, 2, 3, 4, 5, 6)
    val drop = number.drop(3)
    val drop1 = number.dropLast(3)

    println(drop)
    println(drop1)
/*
   output: [4, 5, 6]
*/
}

/*
fungsi take() bisa kita manfaatkan untuk menyaring item yang berada di dalam sebuah objek collection.
 */

fun mainTake(){
    val total = listOf(1, 2, 3, 4, 5, 6)
    val take = total.take(3)
    val take1 = total.takeLast(3)

    println(take)
    println(take1)

/*
   output: [4, 5, 6]
*/
}

/*
fungsi slice() membutuhkan sebuah argumen berupa Range yang digunakan untuk menentukan posisi pertama dan terakhir yang akan disaring.
 */

fun mainSlice(){
    val total = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val slice = total.slice(3..6 step 2)

    println(slice)

/*
   output: [4, 6]
*/
}

/*
untuk menyaring item yang sama tersebut kita akan melakukan iterasi dan membandingkan setiap itemnya.
Namun dengan Kotlin kita tidak perlu melakukannya secara manual, karena Kotlin Collection menyediakan fungsi untuk melakukannya dengan mudah yaitu fungsi distinct()
 */

fun mainDistict(){
    data class Item(val key: String, val value: Any)

    val items = listOf(
        Item("1", "Kotlin"),
        Item("2", "is"),
        Item("3", "Awesome"),
        Item("3", "as"),
        Item("3", "Programming"),
        Item("3", "Language")
    )

    val distinctItems = items.distinctBy { it.key }
    distinctItems.forEach {
        println("${it.key} with value ${it.value}")
    }

/*
   output:
       1 with value Kotlin
       2 with value is
       3 with value Awesome
*/
}

/*
fungsi chunked() bisa kita gunakan untuk memecah nilai String menjadi beberapa bagian kecil dalam bentuk Array.
 */

fun mainChunked(){
    val word = "QWERTY"
    val chunkedTransform = word.chunked(3) {
        it.toString().toLowerCase()
    }

    println(chunkedTransform)

/*
   output: [qwe, rty]
*/
}