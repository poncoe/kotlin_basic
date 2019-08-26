package dataclassescollections

/*
menginginkan hasil yang akurat seperti pada data class, maka Anda perlu membuat fungsi equals() secara manua
 */

class UserEqals(val name : String, val age : Int){

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as UserEqals

        if (name != other.name) return false
        if (age != other.age) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + age
        return result
    }
}