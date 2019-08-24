package basic.sfeevsoperator

/*
Elvis Operator (?:)

Elvis operator memungkinkan kita untuk menetapkan default value atau nilai dasar jika objek bernilai null.
 */

fun main(){
    val text1: String? = null
    val textLength1 = text1?.length ?: 7

    // Implementasi pada Kondisi If & Else //

    val textLength2 = if (text1 != null) text1.length else 7

    // --- //

    /*
    penanganan objek nullable. Perhatikan penggunaan operator non-null assertion (!!)
     */

    val text2: String? = null
    val textLength = text2!!.length // ready to go ???
}