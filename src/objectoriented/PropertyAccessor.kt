package objectoriented

class Animal{
    var name: String = "Kucing Item Putih"
        get(){
            println("Fungsi Getter terpanggil")
            return field
        }
        set(value){
            println("Fungsi Setter terpanggil")
            field = value
        }
}

/*
Pada kode  ${meonk.name} sebenarnya terjadi proses pemanggilan fungsi getter pada properti name.
Namun kita tidak melakukan override pada fungsi getter  sehingga fungsi tersebut hanya mengembalikan nilai name saja.
Begitu juga pada kode meonk.name = "Goose" pada kode tersebut terjadi pemanggilan fungsi setter pada properti name.
 */

fun main(){
    val meonk = Animal()
    println("Nama: ${meonk.name}" )
    meonk.name = "Panda"
    println("Nama: ${meonk.name}")
}

/*
output:
Fungsi Getter terpanggil
Nama: Kucing Item Putih
Fungsi Setter terpanggil
Fungsi Getter terpanggil
Nama: Panda
*/