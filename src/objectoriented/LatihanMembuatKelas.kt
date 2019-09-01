package objectoriented

class Kucing(val name: String,
             val weight: Double,
             val age: Int,
             val isMammal: Boolean
) {

    fun eat(){
        println("$name makan!")
    }

    fun sleep() {
        println("$name tidur!")
    }
}

fun main() {
    val dicodingCat = Kucing("Kucing Item Putih", 4.2, 2,true)
    println("Nama: ${dicodingCat.name}, Berat: ${dicodingCat.weight}, Umur: ${dicodingCat.age}, mamalia: ${dicodingCat.isMammal}" )
    dicodingCat.eat()
    dicodingCat.sleep()
}

/*
OUTPUT :

Nama: Kucing Item Putih, Berat: 4.2, Umur: 2, mamalia: true
Kucing Item Putih makan!
Kucing Item Putih tidur!
 */