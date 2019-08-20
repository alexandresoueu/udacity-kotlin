package Classes

//fun String.hasSpaces(): Boolean {
//    val found: Char? = this.find { it == ' ' }
//    return found != null
//}

fun String.hasSpaces() = find { it == ' ' } != null

fun extensionsExample() {
    "Does it have spacer?".hasSpaces()
}

open class AquariumPlant(val color: String, private val size: Int)

class GreenLeafyPlant(size: Int) : AquariumPlant("green", size)

fun AquariumPlant.isRed() = color == "Red"

//fun AquariumPlant.isBig() = size > 50 Error Because size is private


fun AquariumPlant.print() = println("AquariumPlant")

fun GreenLeafyPlant.print() = println("GreenLeafyPlant")

fun staticExample() {
    val plant = GreenLeafyPlant(size = 50)
    plant.print() // GreenLeafyPlant

    val aquariumPlant: AquariumPlant = plant
    aquariumPlant.print()
}

class AquariumPlantTwo(val color: String, private val size: Int)

fun AquariumPlantTwo?.pull() {
    this?.apply { println("removing $this") }
}

fun nullableExample() {
    val plant: AquariumPlantTwo? = null
    plant.pull()
}