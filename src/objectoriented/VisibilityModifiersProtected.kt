package objectoriented

/*
Hak akses protected mirip seperti private, namun pembatasannya lebih luas dalam sebuah hirarki kelas.
Hak akses protected digunakan ketika kita menginginkan sebuah anggota dari
induk kelas dapat diakses hanya oleh kelas yang merupakan turunannya.
 */

open class AnimalProtected(val name: String, protected val weight: Double)

/*
properti weight pada kelas Animal memiliki hak akses protected.
Kita tetap bisa mengaksesnya dari kelas CatProtected yang termasuk dalam hirarki kelas AnimalProtected.
Namun kita tidak dapat mengakses properti tersebut secara langsung dari luar hirarki kelasnya.
 */

class CatProtected(pName: String, pWeight: Double) : AnimalProtected(pName, pWeight)

fun main() {
    val cat = CatProtected("Meonk", 2.0)
    println("Nama Kucing: ${cat.name}")
    //   println("Berat Kucing: ${cat.weight}") //Cannot access 'weight': it is protected in 'CatProtected'
}