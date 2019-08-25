package basic

fun main() {
    val user = setUser("Poncoe", 20)
    println(user)

    printUser("Poncoe")
}

fun setUser(name: String, age: Int) = "Your name is $name, and you $age years old"

fun printUser(name: String) {
    println("Your name is $name")
}

/*
output :
Your name is Poncoe, and you 20 years old
Your name is Poncoe

langkah :

1. membuat func dari setUser dengan parameter name adalah String dan age adalah Integer, lalu parameter dari
si name & age dipanggil dengan $name & $age
2. implementasi pada main si setUsernya dan isikan parameternya yaitu nama dan umur
3. output si prosedur user
4. untuk printUser kalian sama kayak di point no 2
*/