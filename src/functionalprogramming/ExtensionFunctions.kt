package functionalprogramming

fun main() {
    10.printInt()
    main1()
}

fun Int.printInt() {
    print("value $this")
}

/*
   output : value 10
*/

/*
menetapkan jika extension functions tersebut dapat mengembalikan nilai, deklarasinya pun sama halnya seperti fungsi pada umumnya.
 */

fun main1() {
    println(10.plusThree())
}

fun Int.plusThree(): Int {
    return this + 3
}

/*
   output : 13
*/