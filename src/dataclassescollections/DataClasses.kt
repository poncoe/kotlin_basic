package dataclassescollections

class User(val name : String, val age : Int){
    override fun toString(): String {
        return "User(name=$name, age=$age)"
    }
}

data class DataUser(val name : String, val age : Int)

fun main(){
    val user = User("poncoe", 20)
    val dataUser = DataUser("poncoe", 20)

    println(user)
    println(dataUser)
    mainEquals()

}

// Equals

fun mainEquals(){
    val dataUser = DataUser("poncoe", 17)
    val dataUser2 = DataUser("embul", 17)
    val dataUser3 = DataUser("shiro", 24)

    println(dataUser.equals(dataUser2))
    println(dataUser.equals(dataUser3))

}
