package objectoriented

/*
Secondary constructor digunakan ketika kita ingin menginisialisasi sebuah kelas dengan cara yang lain.
Anda dapat membuat lebih dari satu secondary constructor. Sebagai contoh, kita bisa menambahkan secondary constructor
pada kelas Animal1
 */

class Animal1(name: String, weight: Double, age: Int) {
    val name: String
    val weight: Double
    val age: Int
    var isMammal: Boolean

    init {
        this.weight = if(weight < 0) 0.1 else weight
        this.age = if(age < 0) 0  else age
        this.name = name
        this.isMammal = false
    }

    constructor(name: String, weight: Double, age: Int, isMammal: Boolean) : this(name, weight, age) {
        this.isMammal = isMammal
    }
}

fun main() {
    val meonk = Animal1("Panda", 2.5, 2, true)
    println("Nama: ${meonk.name}, Berat: ${meonk.weight}, Umur: ${meonk.age}, mamalia: ${meonk.isMammal}")

    val burunk = Animal1("Parkit", 0.5, 1)
    println("Nama: ${burunk.name}, Berat: ${burunk.weight}, Umur: ${burunk.age}, mamalia: ${burunk.isMammal}")
}

/*
output:
    Nama: Panda, Berat: 2.5, Umur: 2, mamalia: true
    Nama: Parkit, Berat: 0.5, Umur: 1, mamalia: false
*/