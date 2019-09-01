package objectoriented

class Hewan(name: String, weight: Double, age: Int, isMammal: Boolean) {
    val name: String = name
    val weight: Double = if(weight < 0) 0.1 else weight
    val age: Int = if(age < 0) 0  else age
    val isMammal: Boolean = isMammal

//    init {
//        this.weight = if (weight < 0) 0.1 else weight
//        this.age = if (age < 0) 0 else age
//        this.name = name
//        this.isMammal = isMammal
//    }

}

fun main() {
    val meonk = Hewan("Panda", 4.2, 2, true)
    println("Nama: ${meonk.name}, Berat: ${meonk.weight}, Umur: ${meonk.age}, mamalia: ${meonk.isMammal}")
}

/*
output:
    Nama: Panda, Berat: 4.2, Umur: 2, mamalia: true
*/