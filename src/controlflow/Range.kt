package controlflow

fun printOther(){
    println()

    range()

    println()

    rangeIn()

    println()

    rangeStep()

    println()

    rangeIf()

    println()

    downTo()
}

fun main() {
    val rangeInt = 1..10
    print(rangeInt.step)

    printOther()
}

/*
   output: 1
*/

fun range() {
    val rangeInt = 1..10 step 2
    rangeInt.forEach {
        print("$it ")
    }
    println(rangeInt.step)
}

/*
   output: 1 3 5 7 9 2
*/

fun downTo() {
    val tenToOne = 10.downTo(1)
    if (7 in tenToOne) {
        println("Value 7 available")
    }
}
/*
   output: Value 7 available
*/

fun rangeIf() {
    if (1 <= 7 && 7 <= 10){
        println("Value 7 available")
    }
}
/*
   output: Value 7 available
*/

fun rangeIn() {
    val tenToOne = 10.downTo(1)
    if (11 !in tenToOne) {
        println("No value 11 in Range ")
    }
}
/*
   output: No value 11 in Range
*/