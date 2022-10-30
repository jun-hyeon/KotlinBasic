class Weapon(val name: String)
class Players{
    var weapon : Weapon? = Weapon("Ebony-Kris")

    fun printWeapon(){
        weapon?.also{
            println(it.name)
        }
    }
}

fun main(args: Array<String>){
    Players().printWeapon()
}