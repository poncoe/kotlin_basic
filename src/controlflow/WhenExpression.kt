package controlflow

fun main() {
    val value = 7

    main1()

    println()
    println()

    main2()

    println()
    println()

    main3()

    println()
    println()

    main4()

    println()
    println()

    main5()

    println()
    println()

    main6()

    println()
    println()

    main7()

    when(value){
        6 -> println("value is 6")
        7 -> println("value is 7")
        8 -> println("value is 8")
    }
}

/*
   output: value is 7
*/

/*
when akan mencocokan semua argumen yang berada di setiap branch secara berurutan sampai salah satu kondisi terpenuhi.
Di dalam when kita juga bisa menambahkan branch else
 */

fun main1() {
    val value = 20

    when(value){
        6 -> println("value is 6")
        7 -> println("value is 7")
        8 -> println("value is 8")
        else -> println("value cannot be reached")
    }
}

/*
   output: value cannot be reached
*/

/*
else akan dievaluasi jika tiada satupun kondisi yang terpenuhi pada branch sebelumnya.
Sama halnya seperti if expression, when expression dapat mengembalikan nilai dan dapat disimpan di dalam sebuah variabel
 */

fun main2() {
    val value = 7
    val stringOfValue = when (value) {
        6 -> "value is 6"
        7 -> "value is 7"
        8 -> "value is 8"
        else -> "value cannot be reached"
    }

    println(stringOfValue)
}

/*
   output : value is 7
*/

/*
else adalah hal wajib jika kita menggunakan when expression untuk mengembalikan nilai.
Bagaimana jika kita melewatkannya? Akan tampil eror berikut:
'when' expression must be exhaustive, add necessary 'else' branch
 */

fun main3() {
    val value = 7
    val stringOfValue = when (value) {
        6 -> {
            println("Six")
            "value is 6"
        }
        7 -> {
            println("Seven")
            "value is 7"
        }
        8 -> {
            println("Eight")
            "value is 8"
        }
        else -> {
            println("undefined")
            "value cannot be reached"
        }
    }

    println(stringOfValue)
}

/*
   output : value is 7

*/

/*
when juga memungkinkan kita untuk memeriksa instance dengan tipe tertentu dari sebuah objek menggunakan is atau !is
 */

fun main4() {
    val anyType : Any = 100L
    when(anyType){
        is Long -> println("the value has a Long type")
        is String -> println("the value has a String type")
        else -> println("undefined")
    }
}

/*
   output : the value has a Long type
*/

/*
when expression juga bisa kita gunakan untuk memeriksa nilai yang terdapat pada sebuah Range atau Collection
 */

fun main5() {
    val value =  27
    val ranges = 10..50

    when(value){
        in ranges -> println("value is in the range")
        !in ranges -> println("value is outside the range")
        else -> println("value undefined")
    }
}

/*
   output : value is in the range
*/

/*
if expression sebaiknya digunakan ketika kondisi yang diberikan tidak lebih dari 2 (dua) dan kondisi yang diberikan tidak terlalu rumit
 */

fun main6(){
    val anyType : Any = 100L
    if (anyType is Long){
        println("the value has a Long type")
    } else {
        println("the value is not Long type")
    }
}

/*
when expression, ia bisa digunakan ketika kondisi yang diberikan lebih dari 2 (dua)
 */

fun main7(){
    val anyType: Any = 100L
    when (anyType) {
        is Long -> println("the value has a Long type")
        is Int -> println("the value has a Int type")
        is Double -> println("the value has a Double type")
        else -> println("undefined")
    }
}