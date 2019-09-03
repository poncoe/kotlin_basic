package objectoriented

/*
abstract merupakan gambaran umum dari sebuah kelas. Ia tidak dapat direalisasikan dalam sebuah objek.
 */

abstract class Animals(var name: String, var weight: Double, var age: Int, var isCarnivore: Boolean){

    fun eat(){
        println("$name sedang makan !")
    }

    fun sleep(){
        println("$name sedang tidur !")
    }
}

/*
Dengan begitu kelas Animal tidak dapat kita inisialisasikan menjadi sebuah objek.
 */

fun main(){
    //val animal = Animal("dicoding animal", 2.6, 1, true) // Cannot create an instance of an abstract class
}