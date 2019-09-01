package objectoriented

/*
Extension properties dilakukan di luar kelas. Dengan demikian,
Extension properties hanya bisa didefinisikan dengan cara menyediakan getter dan/atau setter secara eksplisit.

Kita dapat menambahkan sebuah properti tanpa harus membuat sebuah kelas yang mewarisi kelas tersebut.
 */

class AnimalExtProperties(var name: String, var weight: Double, var age: Int, var isMammal: Boolean)

val AnimalExtProperties.getAnimalInfo : String
    get() =  "Nama: ${this.name}, Berat: ${this.weight}, Umur: ${this.age} Mamalia: ${this.isMammal}"

fun main() {
    val meonk = AnimalExtProperties("Meonk", 5.0, 2, true)
    println(meonk.getAnimalInfo)
}