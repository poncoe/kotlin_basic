package latihan

/*
TODO 1 :
Lengkapi inisialisasi variable result dengan melakukan operasi matematika pada argumen yang diberikan dengan rumus perhitungan berikut:
valueA + (valueB - valueC)
Jika valueC bernilai null berikan 100 untuk nilai defaultnya.

TODO 2 :
Lengkapi dengan kode untuk mengembalikan nilai berupa teks yang nantinya akan dicetak pada konsol.

TODO 3 :
Tambahkan kode untuk mencetak nilai dari variable result.

Jika dijalankan, maka pada konsol akan menampilkan text:
Result is 39
 */

fun main() {
    val valueA = 65
    val valueB = 52
    val valueC = 78

    val result = calculate(valueA, valueB, valueC)

    // TODO 3
    println(result)
}

fun calculate(valueA: Int, valueB: Int, valueC: Int?): String {
    // TODO 1

    val result:Int?
    if(valueC!=null) result = valueA + (valueB - valueC) else result = valueA + (valueB - 100)

    return generateResult(result)
}

// TODO 2
fun generateResult(result: Int) = "Result is $result"