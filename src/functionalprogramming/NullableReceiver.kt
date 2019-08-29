package functionalprogramming

fun main() {
    val value: Int? = null
    val value1: Int? = null

    println(value?.slices)
    println(value1?.slices)
}

val Int.slices: Int
    get() = this.div(2)

/*
   output : null
            null

*/