package basic.booleann

/*
Berbeda dengan operator AND (&&), operator OR (||)
akan mengembalikan nilai true jika hasil evaluasi dari salah satu expressions yang diberikan bernilai true.
 */

fun main() {
    val petShopOpen = 7
    val petShopClosed = 16
    val now = 20

    val isOpen = now < petShopOpen || now > petShopClosed

    print("Pet Shop is closed : $isOpen")

    /*
        Output : Pet Shop is closed : true
     */
}