package functionalprogramming

fun main(){
    mainLet()
    println()
    mainAlso()
}

/*
Lambda argument (it)
fungsi yang menggunakan lambda argument untuk mengakses konteks dari sebuah objek adalah fungsi let dan also.
 */

fun lambdaArgument(){
    val text = "Hello"
    text.let {
        val message = "$it Kotlin"
        println(message)
    }

    // ATAU //

    val text1 = "Hello"
    text1.let { value ->
        val message = "$value Kotlin"
        println(message)
    }
}

// SCOPE FUNCTION //

/*
LET

Fungsi let menggunakan argumen (it) untuk mengakses konteks dari sebuah objek.
Penggunaan fungsi let akan banyak kita temukan pada objek yang bertipe non-null.
 */

fun mainLet() {
    val message: String? = null
    message?.let {
        val length = it.length * 2
        val text = "text length $length"
        println(text)
    }.run {
        val text = "message is null"
        println(text)
    }
}

/*
ALSO

Fungsi also sama seperti fungsi apply, di mana nilai yang dikembalikan adalah nilai dari konteks objek.
Namun untuk konteks objeknya tersedia sebagai argumen (it).
Fungsi also baiknya digunakan ketika kita ingin menggunakan konteks dari objek sebagai argumen tanpa harus mengubah nilainya.
 */

fun mainAlso() {
    val text = "Hello Kotlin"
    val result = text.also {
        println("value length -> ${it.length}")
    }

    println("text -> $result")
}

/*
   output :
           value length -> 12
           text -> Hello Kotlin
*/