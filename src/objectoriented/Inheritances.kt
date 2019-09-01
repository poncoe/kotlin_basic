package objectoriented

/*
konsep inheritance atau pewarisan harus diterapkan. Pewarisan dapat mencegah kita melakukan perulangan kode.
 */

class ChildClass {
    open class Kucink(val name: String, val weight: Double, val age: Int, val isCarnivore: Boolean) {

        open fun eat() {
            println("$name sedang makan!")
        }

        open fun sleep() {
            println("$name sedang tidur!")
        }
    }
}

class Cat(
    pName: String,
    pWeight: Double,
    pAge: Int,
    pIsCarnivore: Boolean,
    val furColor: String,
    val numberOfFeet: Int
) : ChildClass.Kucink(pName, pWeight, pAge, pIsCarnivore) {

    fun playWithHuman() {
        println("$name bermain bersama Manusia !")
    }

    override fun eat() {
        println("$name sedang memakan ikan !")
    }

    override fun sleep() {
        println("$name sedang tidur di bantal !")
    }
}

fun main() {
    val meonk = Cat("Panda", 3.2, 2, true, "Black & White", 4)

    meonk.playWithHuman()
    meonk.eat()
    meonk.sleep()
}

/*
output:
    Panda bermain bersama Manusia !
    Panda sedang memakan ikan !
    Panda sedang tidur di bantal !
*/