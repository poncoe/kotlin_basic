package basic.string

/*
ada dasarnya sekumpulan karakter dalam String tersebut berbentuk Array,
sehingga kita bisa mendapatkan karakter tunggal dengan mudah. Caranya,
manfaatkan indexing seperti berikut:
 */

fun main() {
    val text  = "Poncoe"
    val firstChar = text[0]

    print("Karakter pertama dari $text adalah $firstChar")
}

/*
  output : Karakter pertama dari Poncoe adalah P
*/