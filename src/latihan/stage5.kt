package latihan

/*
TODO 1 :
Lengkapi kode pada kelas Cat dengan ketentuan seperti berikut:
Buatlah fungsi getter setter untuk properti sleep yang di dalamnya terdapat fungsi untuk mencetak teks:
Fungsi getter/setter dipanggil
Tambahkan kode pada fungsi toSleep() untuk mencetak teks:
[name], sleep!
jika sleep bernilai true dan teks:
name, let's play!
jika sleep bernilai false.

TODO 2 :
Lengkapi inisialisasi dengan kelas Cat.

Jika dijalankan konsol akan menampilkan teks seperti berikut:
Fungsi getter dipanggil
Gippy, let's play!
Fungsi setter dipanggil
Fungsi getter dipanggil
Gippy, sleep!
 */

// TODO 1
class Cat(private val name: String) {
    // private var sleep: Boolean = false
    var sleep: Boolean = false
        //    fun setSleep(value: Boolean){
//        sleep = value
//    }
//    fun getSleep(): Boolean = sleep
        get() {
            println("Fungsi getter dipanggil")
            return field
        }
        set(value) {
            println("Fungsi setter dipanggil")
            field = value
        }

    fun toSleep() {
        if(sleep){
            // println("Fungsi getter dipanggil")
            println("$name, sleep!")
        } else {
            //println("Fungsi getter dipanggil")
            println("$name, let's play!")
            //println("Fungsi setter dipanggil")
        }
    }
}

fun main() {

    // TODO 2
    val gippy = Cat("Gippy")

    gippy.toSleep()
    //gippy.setSleep(true)
    gippy.sleep = true
    gippy.toSleep()
}