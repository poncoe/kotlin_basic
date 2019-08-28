package functionalprogramming

fun main() {

    // val fullName = getFullName(first = "Meonk")

    val fullName = getFullNameDefault()
    print(fullName)
}

fun getFullNameDefault(first: String = "Kotlin", middle: String = " is ", last: String = "Awesome"): String {
    return "$first $middle $last"
}

/*
   output : Kotlin is Awesome
*/