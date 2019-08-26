package dataclassescollections

/*
Destructuring Declaration adalah proses memetakan objek menjadi sebuah variabel.
Ini bisa dengan mudah kita lakukan pada data class. Dengan fungsi componentN() yang ada pada data class,
kita bisa menguraikan sebuah objek menjadi beberapa properti yang dimilikinya. Sebagai contoh,
kita ingin menguraikan objek dataUser
 */

data class DataUsers(val name : String, val age : Int){
    fun intro(){
        println("My name is $name, I am $age years old")
    }
}

fun main(){
    val dataUser = DataUsers("poncoe", 20)
    dataUser.intro()

    val name = dataUser.component1()
    val age = dataUser.component2()

    println("My name is $name, I am $age years old")
}