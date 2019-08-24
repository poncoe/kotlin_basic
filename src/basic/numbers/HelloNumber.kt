package basic.numbers

fun helloNumber(){

    /*
    Int (32bit) Int adalah tipe data yang umumnya digunakan untuk menyimpan nilai numerik.
    Int dapat menyimpan data dari range -2^31 sampai +2^31-1. Dengan ukuran 32 Bit kita bisa menggunakannya untuk menyimpan nilai yang besar.
    Catatannya, tetap lihatlah batasan nilai maksimal yang dapat dimasukkan.
     */

    val intNumbers = 100

    //--------------//

    /*
    Long (64 Bit) Long adalah tipe data yang digunakan untuk menyimpan nilai numerik yang lebih besar yaitu dari range -2^63 sampai +2^63-1.
    Long bisa didefinisikan secara eksplisit:
     */

    val longNumbers: Long = 100

    /*
    Menambahkan suffix L pada long
     */

    val longNumbers2 = 100L

    //--------------//

    /*
    Short (16 Bit) Short merupakan sebuah bilangan bulat yang hanya dapat menyimpan nilai yang kecil karena hanya berukuran 16 Bit.
     */

    val shortNumber: Short = 10

    //--------------//

    /*
    Byte (8 Bit) Dengan ukuran yang kecil, Byte hanya mampu menyimpan nilai yang kecil sama halnya seperti Short.
    Byte biasa digunakan untuk keperluan proses membaca dan menulis data dari sebuah stream file atau jaringan.
     */

    val byteNumber = 0b11010010

    //--------------//

    /*
    Double (64 Bit) Sama halnya dengan Long yang memiliki ukuran yang besar,
    Double mampu menyimpan nilai numerik yang besar pula.
    Pada umumnya Double digunakan untuk menyimpan nilai numerik pecahan.
     */

    val doubleNumbers = 1.3

}