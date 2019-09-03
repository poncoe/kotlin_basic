package latihan

/*
TODO 1 :
Lengkapi dengan ekspresi jika nilai number bernilai genap maka proses iterasi akan dilewatkan.

TODO 2 :
Lengkapi dengan ekspresi jika nilai number bernilai lebih dari 10 maka proses iterasi akan dilewatkan.

TODO 2 :
Lengkapi inisialisasi variable result dengan rumus perhitungan berikut:
number x ( number + 2 )
Jika dijalankan konsol akan menampilkan teks seperti berikut:
result is 3
result is 15
result is 35
result is 63
result is 99
 */

fun main() {
    val listNumber = 1.rangeTo(30)

    for (number in listNumber) {
        // TODO 1
        if (number % 2 == 0) continue

        // TODO 2
        if (number > 10) continue

        // TODO 3
        val result = number * (number + 2)
        println("result is $result")
    }
}