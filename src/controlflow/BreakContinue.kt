package controlflow

// Break & Continue

fun printBreakContinue(){
    mainBreak()
    println()
    combine()
}

// CONTINUE

fun main() {
    val listOfInt = listOf(1, 2, 3, null, 5, null, 7)

    for (i in listOfInt) {
        if (i == null) continue
        print(i)
    }
    printBreakContinue()
}
/*
   output: 12357
*/

// BREAK

fun mainBreak() {
    val listOfInt = listOf(1, 2, 3, null, 5, null, 7)

    for (i in listOfInt) {
        if (i == null) break
        print(i)
    }
}

// COMBINE

fun combine() {
    loop@ for (i in 1..10) {
        println("Outside Loop")

        for (j in 1..10) {
            println("Inside Loop")
            if ( j > 5) break@loop
        }
    }
}

/*
   output :
       Outside Loop
       Inside Loop
       Inside Loop
       Inside Loop
       Inside Loop
       Inside Loop
       Inside Loop
*/
