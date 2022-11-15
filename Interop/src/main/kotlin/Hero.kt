@file:JvmName("Hero")
fun main() {
    val adversary = Jhava()
    println(adversary.utterGreeting())

    val friendshipLevel = adversary.determineFriendsshipLevel()
    println(friendshipLevel?.lowercase() ?: "무슨 의미인지 난해하군요.")

    val adversaryHitPoints : Int = adversary.hitPoints
    println(adversaryHitPoints.dec())
    println(adversaryHitPoints.javaClass)

    adversary.greeting = "hello, Hero"
    println(adversary.utterGreeting().lowercase())

    adversary.offerFood()
}

fun makeProclamation() = "Hello, Monster!"

@JvmOverloads
fun handOverFood(leftHand: String = "딸기", rightHand : String = "고기"){
    println("맛있는 $leftHand 와 $rightHand 를 넘겨주었습니다.")
}

class Spellbook{
    val spells = listOf("Magic Ms. L", "Lay on Hans")
}