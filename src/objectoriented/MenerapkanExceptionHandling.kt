package objectoriented

/*
Try-Catch

Salah satu cara untuk menangani suatu exception adalah menggunakan try-catch.
Kode yang dapat membangkitkan suatu exception disimpan dalam blok try, dan jika exception tersebut terjadi,
maka blok catch akan terpanggil

Contoh Kode :

try {
    // Block try, menyimpan kode yang membangkitkan exception
} catch (e: SomeException) {
    // Block catch akan terpanggil ketika exception bangkit.
}
 */

import kotlin.NumberFormatException

fun main() {
    val someNullValue: String? = null
    lateinit var someMustNotNullValue: String

    try {
        someMustNotNullValue = someNullValue!!
        println(someMustNotNullValue)
    } catch (e: Exception) {
        someMustNotNullValue = "Nilai String Null"
        println(someMustNotNullValue)
    }

    println()
    mainTCF()
    mainMC()
}

/*
output:
    Nilai String Null
*/

// ---- //

/*
Try-Catch-Finally

Selain terdapat blok try dan catch, ada juga blok finally. Hanya saja blok ini bersifat opsional.
finally akan dieksekusi setelah program keluar dari blok try ataupun catch.
Bahkan finally juga tereksekusi ketika terjadi exception yang tidak terduga.
 */

fun mainTCF() {
    val someNullValue: String? = null
    lateinit var someMustNotNullValue: String

    try {
        someMustNotNullValue = someNullValue!!
    } catch (e: Exception) {
        someMustNotNullValue = "Nilai String Null"
    } finally {
        println(someMustNotNullValue)
    }
}

/*
output:
    Nilai String Null
*/

// ---- //

/*
Mutiple Catch

Multiple catch memungkinkan untuk penanganan exception dapat ditangani lebih dari satu tipe exception.
Hal ini sangat berguna ketika kita ingin menangani setiap tipe exception dengan perlakuan yang berbeda.

Contoh Kode :

try{
    // Block try, menyimpan kode yang membangkitkan exception
} catch (e: NullPointerException) {
    // Block catch akan terpanggil ketika terjadi NullPointerException.
} catch (e: NumberFormatException) {
    // Block catch akan terpanggil ketika terjadi NumberFormatException.
} catch (e: Exception) {
    // Block catch akan terpanggil ketika terjadi Exception selain keduanya.
}
finally {
    // Block finally akan terpanggil setelah keluar dari block try atau catch
}
 */

fun mainMC() {
    val someStringValue: String? = null
    var someIntValue: Int = 0

    try {
        someIntValue = someStringValue!!.toInt()
    } catch (e: NullPointerException) {
        someIntValue = 0
    } catch (e: NumberFormatException) {
        someIntValue = -1
    } finally {
        when(someIntValue){
            0 -> println("Catch block NullPointerException terpanggil !")
            -1 -> println("Catch block NumberFormatException terpanggil !")
            else -> println(someIntValue)
        }
    }
}

/*
output:
    Catch block NullPointerException terpanggil!
*/