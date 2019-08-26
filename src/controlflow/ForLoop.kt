package controlflow

fun main() {
    val ranges = 1..5
    for (i in ranges){
        println("value is $i!")

        println()

        rangeStep()

        println()

        withIndex()

        println()

        forEach()

        println()

        forEachIndex()
    }
}

/*
   output :
       value is 1!
       value is 2!
       value is 3!
       value is 4!
       value is 5!

*/

fun rangeStep() {
    val ranges = 1.rangeTo(10) step 3
    for (i in ranges ){
        println("value is $i!")
    }
}

/*
   output :
       value is 1!
       value is 4!
       value is 7!
       value is 10!
*/

fun withIndex() {
    val ranges = 1.rangeTo(10) step 3
    for ((index, value) in ranges.withIndex()) {
        println("value $value with index $index")
    }
}
/*
   output :
       value 1 with index 0
       value 4 with index 1
       value 7 with index 2
       value 10 with index 3
*/

fun forEach() {
    val ranges = 1.rangeTo(10) step 3
    ranges.forEach { value ->
        println("value is $value!")
    }
}

/*
   output :
       value is 1!
       value is 4!
       value is 7!
       value is 10!
*/

fun forEachIndex() {

    val ranges = 1.rangeTo(10) step 3
    ranges.forEachIndexed { index, value ->
        println("value $value with index $index")
    }
}
/*
   output :
       value 1 with index 0
       value 4 with index 1
       value 7 with index 2
       value 10 with index 3
*/
