package dataclassescollections

/*
Data class juga memungkinkan kita untuk menyalin sebuah objek
dengan sangat mudah hanya dengan memanfaatkan fungsi copy() di dalamnya
 */

fun main(){
    val dataUser = DataUser("nrohmen", 17)
    val dataUser2 = DataUser("nrohmen", 17)
    val dataUser3 = DataUser("dimas", 24)
    val dataUser4 = dataUser.copy()
    val dataUser5 = dataUser.copy(age = 18)

    println(dataUser4)
    println(dataUser2)
    println(dataUser3)
    println(dataUser5)
}