package objectoriented

/*
Interfaces merupakan suatu konsep sifat umum yang nantinya digunakan oleh suatu kelas agar dapat memiliki sifat tersebut.
Interface sangat mirip dengan abstract class, namun tanpa sebuah properti deklarasi dan fungsi yang dideklarasikan tanpa isi.
 */

interface IFly {
    fun fly()
    val numberOfWings: Int
}

class Bird(override val numberOfWings: Int) : IFly {

    override fun fly() {
        if(numberOfWings > 0) println("Flying with $numberOfWings wings")
        else println("I'm Flying without wings")
    }
}