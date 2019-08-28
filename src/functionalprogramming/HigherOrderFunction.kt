package functionalprogramming

/*
Dalam mendeklarasi lambda, khususnya jika ingin ditetapkan agar dapat mengembalikan nilai,
terkadang kompiler tidak dapat menentukan tipenya. Alhasil, kita perlu menuliskannya secara eksplisit.
 */

fun main() {
    printResult(10 ,sum)
}

fun printResult(value: Int, sum: (Int) -> Int) {
    val result = sum(value)
    println(result)
}

var sum: (Int) -> Int = { value -> value + value }

/*
   output : 20
*/

