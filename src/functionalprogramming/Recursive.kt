package functionalprogramming

/*
Recursion merupakan sebuah teknik dasar dalam pemrograman yang bisa kita gunakan untuk menyederhanakan
pemecahan masalah yang umumnya diselesaikan dengan cara yang kompleks.
 */

fun factorial(n: Int): Int {
    return if (n == 1) {
        n
    } else {
        var result = 1
        for (i in 1..n) {
            result *= i
        }
        result
    }
}

// ATAU //

fun factorial1(n: Int): Int {
    return if (n == 1) {
        n
    } else {
        n * factorial1(n - 1)
    }
}

/*
Tail Call Recursion
 */

// fun factorial(n: Int, result: Int = 1): Int {
tailrec fun factorial(n: Int, result: Int = 1): Int {
    val newResult = n * result
    return if (n == 1) {
        newResult
    } else {
        factorial(n - 1, newResult)
    }
}