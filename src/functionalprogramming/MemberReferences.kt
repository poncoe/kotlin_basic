package functionalprogramming

fun main(){
    mainFReferences()
    println()
    mainPReferences()
}

/*
Function References

Dengan menggunakan operator :: kita bisa menggunakannya sebagai instances dari function type.
Sebagai contoh, penggunaan fungsi filter() yang menjadi bagian dari kelas List
 */

fun mainFReferences() {
    val numbers = 1.rangeTo(10)
    val evenNumbers = numbers.filter(Int::isEvenNumber)

    println(evenNumbers)
}

fun Int.isEvenNumber() = this % 2 == 0

/*
   output = [2, 4, 6, 8, 10]
*/

/*
Property References

Operator :: juga dapat digunakan untuk mereferensikan sebuah properti.
Dengan Operator, kita bisa mengakses apa yang menjadi bagian dari properti tersebut seperti nama,
fungsi setter getter, dll.
 */

var message = "Kotlin"

fun mainPReferences() {
    println(::message.name)
    println(::message.get())

    ::message.set("Kotlin Academy")

    println(::message.get())
}