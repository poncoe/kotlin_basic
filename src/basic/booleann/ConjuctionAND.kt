package basic.booleann

/*
Operator AND (&&) akan mengembalikan nilai true jika semua hasil evaluasi expression yang diberikan bernilai true.
 */

fun main() {
    val petShopOpen = 7
    val petShopClosed = 16
    val now = 20

    val isOpen = now >= petShopOpen && now <= petShopClosed

    /*
    range check

    val isOpen = now in petShopOpen..petShopClosed
     */

    print("Pet Shop is open : $isOpen")

    /*
        Output : Pet Shop is open : false
     */
}