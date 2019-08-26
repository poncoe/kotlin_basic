package dataclassescollections

fun main(){
    val capital = mapOf(
        "Jakarta" to "Indonesia",
        "London" to "England",
        "New Delhi" to "India"
    )

    println(capital["Jakarta"])

// Output: Indonesia

    /*
    get Value
     */

    println(capital.getValue("Jakarta"))

// Output: Indonesia

    /*
    Exceptions
     */

    println(capital["Amsterdam"])

// Output: null


    println(capital.getValue("Amsterdam"))

// Output: Exception in thread "main" java.util.NoSuchElementException: Key Amsterdam is missing in the map.

    /*
    using keys()
     */

    val mapKeys = capital.keys

// mapKeys: [Jakarta, London, New Delhi]

    val mapValues = capital.values

// mapValues: [Indonesia, England, India]

    /*
    Mutable Capitals
     */


    val mutableCapital = capital.toMutableMap()
    mutableCapital.put("Amsterdam", "Netherlands")
    mutableCapital.put("Berlin", "Germany")
}