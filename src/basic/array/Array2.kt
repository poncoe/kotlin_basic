package basic.array

/*
intArrayOf() : IntArray

booleanArrayOf() : BooleanArray

charArrayOf() : CharArray

longArrayOf() : LongArray

shortArrayOf() : ShortArray

byteArrayOf() : ByteArray
 */

fun main() {
    val intArray = intArrayOf(1, 3, 5, 7)  // [1, 3, 5, 7]
    intArray[2] = 11                       // [1, 3, 11, 7]

    print(intArray[2])
}

/*
   Output: 11

   ngubah isi array 5 menjadi 11
   untuk tau cara array kenapa intArray[2] isinya 5 dan diubah jadi 11 isi arraynya
   [1,3,11,7]. bisa di liat di file Arrays.kt
*/