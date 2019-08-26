package dataclassescollections

fun main(){
    val numberListInt : List<Int> = listOf(1, 2, 3, 4, 5)
    val numberList = listOf(1, 2, 3, 4, 5)
    val charList = listOf('a', 'b', 'c')
    val anyList = listOf('a', "Kotlin", 3, true)

    println(anyList[3])
    println(anyList[5]) // Error
    println()
    addList()
}

fun addList(){
    val anyList = mutableListOf('a', "Kotlin", 3, true)
    anyList.add('d') // menambah item di akhir list
    anyList.add(1, "love") // menambah item pada indeks ke-1
    anyList[3] = false // mengubah nilai item pada indeks ke-3
   // anyList.remove(User()) // menghapus item User()
}
