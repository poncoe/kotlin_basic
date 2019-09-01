package objectoriented

/*
Internal merupakan hak akses baru yang diperkenalkan pada Kotlin. Hak akses ini membatasi suatu anggota untuk dapat diakses hanya pada satu modul.
 */

/*
kelas AnimalInternal telah ditetapkan sebagai kelas internal, maka kelas tersebut hanya dapat diakses dari modul yang sama.
Hak akses ini sangat berguna ketika kita mengembangkan sebuah aplikasi yang memiliki beberapa modul di dalamnya.
 */

internal class AnimalInternal(val name: String)