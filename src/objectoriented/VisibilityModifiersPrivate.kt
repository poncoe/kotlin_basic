package objectoriented

/*
Private

Ketika suatu anggota memiliki hak akses private, maka anggota tersebut tidak dapat diakses dari luar scope-nya.
Untuk menggunakan modifier private kita perlu menambahkan keyword private
 */

class AnimalPrivate(private var name: String, private val weight: Double, private val age: Int, private val isMammal: Boolean = true) {

    /*
    Fungsi getName() bertujuan untuk mengembalikan nilai name yang memiliki tipe data String.
    Kemudian fungsi setName() bertujuan untuk mengubah nilai properti name dengan nilai baru.
    Fungsi setName() membutuhkan satu parameter bertipe String yang nantinya akan dimasukkan nilainya ke dalam properti name.
     */

    fun getName() : String {
        return name
    }

    fun setName(newName: String) {
        name = newName
    }

}

fun main() {
    val meonk = AnimalPrivate("Meonk", 2.5, 2)
    println(meonk.getName())
    meonk.setName("Panda")
    println(meonk.getName())
}

/*
output:
    Meonk
    Panda
*/