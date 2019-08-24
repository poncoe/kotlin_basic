package basic.numbers

/*
Terdapat beberapa operator matematika pada tipe data Number seperti penjumlahan (+),
pengurangan (-), perkalian (*) , pembagian (/) dan modulus (%, atau sisa hasil bagi).
 */

fun main() {
    val numberOne = 1
    val numberTwo = 2

    print(numberOne + numberTwo)

    println()
    println()

    pembagian()

    println()
    println()

    tambahKali()

    println()
    println()

    operator()



    /*
        output : 3
     */
}

fun pembagian() {
    val numberOne: Int = 29
    val numberTwo: Int = 10

    print(numberOne / numberTwo)
    /*
        output : 2
     */
}

fun tambahKali() {
    print(5 + 4 * 4)
    /*
     output: 21
     */
}

fun operator() {
    print((5 + 4) * 4)
    /*
     output: 36
     */
}