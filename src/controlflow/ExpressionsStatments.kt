package controlflow

// Expression

fun main() {
    sumExpression(1 , 1 * 4)
    mainStatment() // call Statement
}

fun sumExpression(value1: Int, value2: Int) = value1 + value2

// Statment

fun mainStatment() {
    val value1 = 10
    val value2 = 10

    sumStatment(value1, value2)
}

fun sumStatment(value1: Int, value2: Int) = value1 + value2