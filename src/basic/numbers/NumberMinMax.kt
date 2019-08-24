package basic.numbers

/*
Untuk mengetahui nilai maksimal yang dapat disimpan oleh suatu tipe Number,
kita bisa menggunakan properti MAX_VALUE.  Sementara untuk mengetahui nilai minimal yang dapat disimpan,
gunakan properti MIN_VALUE.
 */

fun main() {
    val maxInt = Int.MAX_VALUE
    val minInt = Int.MIN_VALUE

    println(maxInt)
    println(minInt)

    println()
    println()

    main1()

    /*
     output :
            2147483647
            -2147483648
     */
}

/*
Jika kita memasukan nilai melebihi nilai maksimal yang dapat disimpan,
 maka akan terjadi overflow. Nilai yang akan dikembalikan adalah nilai minimal yang dapat disimpan.
 */

fun main1() {
    val maxInt = Int.MAX_VALUE
    val overRangeInt = Int.MAX_VALUE + 1 // This operation has led to an overflow

    println("Max Int: $maxInt")
    println("Over range Int: $overRangeInt")
}

/*
Output :

Max Int: 2147483647
Over range Int: -2147483648
*/