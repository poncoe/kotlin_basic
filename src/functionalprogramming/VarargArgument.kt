package functionalprogramming

/*
Dengan menggunakan kata kunci varargkita juga bisa menyederhanakan beberapa parameter yang memiliki tipe data yang sama, menjadi parameter tunggal.
 */

fun main() {
    val number = sumNumbers(10, 20, 30, 40)
    print(number)
}

fun sumNumbers(vararg number: Int): Int {
    return number.sum()
}

/*
   output : 100
*/

/*
Generic untuk tipe parameter ketika parameter tersebut ditentukan dengan vararg
 */

fun <T> asList(vararg input: T): List<T> {
    val result = ArrayList<T>()
    for (item in input)
        result.add(item)
    return result
}