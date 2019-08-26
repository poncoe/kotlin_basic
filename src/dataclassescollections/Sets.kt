package dataclassescollections

/*
//integerSet.add(6) // tidak bisa mengubah set immutable
mutableSet.add(6) // menambah item di akhir set
mutableSet.remove(1) //menghapus item yang memiliki nilai 1
 */

fun printSets(){
    setOf()
    println()
    intersect()
}

fun main(){
    val integerSet = setOf(1, 2, 4, 2, 1, 5)
    println(integerSet)

// Output: [1, 2, 4, 5]

    printSets()
}

/*
Secara otomatis fungsi setOf akan membuang angka yang sama, sehingga hasilnya adalah [1, 2, 4, 5].
Selain itu urutan pada Set bukanlah sesuatu yang penting,
sehingga apabila kita bandingkan dua buah Set yang memiliki nilai yang sama dan urutan yang berbeda,
akan tetap dianggap sama.
 */

fun setOf(){
    val setA = setOf(1, 2, 4, 2, 1, 5)
    val setB = setOf(1, 2, 4, 5)
    println(setA == setB)

// Output: true

    print(5 in setA)

// Output: true
}

/*
fungsi union dan intersect untuk mengetahui gabungan dan irisan dari 2 (dua) buah Set.
 */

fun intersect(){
    val setA = setOf(1, 2, 4, 2, 1, 5)
    val setC = setOf(1, 5, 7)
    val union = setA.union(setC)
    val intersect = setA.intersect(setC)

    println(union)
    println(intersect)

// union: [1, 2, 4, 5, 7]
// intersect: [1, 5]
}