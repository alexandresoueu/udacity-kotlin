package Classes.PairsBasket

fun main() {
    val equipment = "fishnet" to "catching fish" to "of big size" to "and strong"
    println(equipment.first)
    println(equipment.second)
    println("======================================")

    val equip = ("fishnet" to "catching fish") to ("of big size" to "and strong")
    println(equip.first)

    val fishnet = "fishnet" to "catching fish"

    val (tool, use) = fishnet

    println("The $tool is a tool for $use")

    val fishnetString = fishnet.toString()
    println(fishnetString)
    println(fishnet.toList())

    fun giveMeATool(): Pair<String, String> {
        return ("fishnet" to "Catching")
    }
    val (GiveTool, GiveUse) = giveMeATool()

    println(GiveTool)
    println(GiveUse)
}