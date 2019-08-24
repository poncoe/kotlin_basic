package basic.booleann

/*
Berbeda dengan operator AND (&&) dan operator OR(||),
operator NOT(!) digunakan untuk melakukan negasi pada hasil evaluasi expression yang diberikan.
Contoh, Jika hasil expressions setelah dievaluasi bernilai true, maka operator NOT akan mengembalikan nilai false.
 */

fun main() {
    val petShopOpen = 7
    val now = 10
    val isOpen = now > petShopOpen

    if (!isOpen) {
        print("Pet Shop is closed")
    } else {
        print("Pet Shop is open")
    }

    /*
        Output : Pet Shop is open
     */
}