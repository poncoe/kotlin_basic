package dataclassescollections

fun main() {
    filter()
    println()
    filternot()
    println()
    map()
    println()
    count()
    println()
    countKelipatanTiga()
    println()
    find()
    println()
    FirstandLast()
    println()
    sum()
    ascendingSort()
    println()
    descendingSort()

}


fun filter() {
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val evenList = numberList.filter { it % 2 == 0 }

    // evenList: [2, 4, 6, 8, 10]
}

/*
Pada kode di atas, kita telah menggunakan filter() untuk menyaring bilangan yang habis dibagi 2 (dua)
atau biasa disebut dengan bilangan genap. Selain itu kita juga dapat mem-filter list berdasar hasil
yang tak sesuai dengan kondisi yang diberikan. Caranya adalah dengan menggunakan fungsi filterNot()
 */

fun filternot() {
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val notEvenList = numberList.filterNot { it % 2 == 0 }

    // notEvenList: [1, 3, 5, 7, 9]
}

/*
Fungsi ini akan membuat collection baru sesuai perubahan yang akan kita lakukan dari collection sebelumnya.
Kita ambil contoh dari numberList yang sudah ada.
Lalu kita buat collection baru yang isinya adalah hasil kali 5 (lima) dari masing-masing item.
 */

fun map() {
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val multipliedBy5 = numberList.map { it * 5 }

    // multipliedBy5: [5, 10, 15, 20, 25, 30, 35, 40, 45, 50]
}

/*
Fungsi count() dapat kita gunakan untuk menghitung jumlah item yang ada di dalam collection.
 */

fun count() {
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    print(numberList.count())

    // Output: 10
}

fun countKelipatanTiga() {
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    print(numberList.count { it % 3 == 0 })

    // Output: 3
}

/*
fungsi yang digunakan untuk mencari item pada sebuah collection.
Untuk mencari item pertama yang sesuai dengan kondisi yang kita tentukan,
kita bisa menggunakan fungsi find()
 */

fun find() {
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val firstOddNumber = numberList.find { it % 2 == 1 }

    // firstOddNumber: 1
}

/*
fungsi first() dan last() digunakan untuk menyaring item pertama atau terakhir dari sebuah collection.
 */

fun FirstandLast() {
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val moreThan10 = numberList.first { it > 10 }
    print(moreThan10)

    // Output: Exception in thread "main" java.util.NoSuchElementException: Collection contains no element matching the predicate.
}

/*
Fungsi sum() khusus hanya bisa digunakan untuk collection yang bertipe angka.
 */

fun sum() {
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val total = numberList.sum()

    // total: 55
}

/*
sorted() digunakan untuk mengurutkan item yang ada di dalam collection.
Secara default fungsi sorted() ini akan mengurutkan data secara ascending.
 */

fun ascendingSort() {
    val kotlinChar = listOf('k', 'o', 't', 'l', 'i', 'n')
    val ascendingSort = kotlinChar.sorted()
    println(ascendingSort)

    // ascendingSort: [i, k, l, n, o, t]
}

fun descendingSort() {
    val kotlinChar = listOf('k', 'o', 't', 'l', 'i', 'n')
    val descendingSort = kotlinChar.sortedDescending()
    println(descendingSort)

    // descendingSort: [t, o, n, l, k, i]
}