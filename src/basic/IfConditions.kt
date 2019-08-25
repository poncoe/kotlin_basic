package basic

// Kondisi  menggunakan IF & Else (Condition using If & else)

fun main(){
    val openHours = 7
    val now = 7
    val petShop: String
    petShop = if (now > 7) {
        "Pet Shop already open"
    } else if (now == openHours){
        "Wait a minute, Pet Shop will be open"
    } else {
        "Pet Shop is closed"
    }

    print(petShop)
}

/*
Output : Wait a minute, Pet Shop will be open

jadi kita membuat kondisi, dimana openHours itu nilai yang ditetapkan, dan Now nilai yang akan kita tetapkan
kita buat prosedur / immutable dari si petshop kita buat dia jadi string, dan kita akan buat 3 kondisi dimana
if (petshop nya udah dibuka), else if (petshop akan dibuka) dan else (petshop tutup)

ketika kita ganti val now nya lebih dari 7 maka akan menoutputkan si if, kurang dari 7 akan mengoutputkan si else
dan jika kita mngisikan nilai sama seperti openHours makan hasilnya adalah si else if
 */