package Classes

interface AquariumAction {
    fun eat()
    fun jump()
    fun clean()
    fun catchFish()
    fun swim() {
        println("swiiim")
    }
}

interface FishActionEXE {
    fun eat()
}

abstract class AquariumFishEXE : FishAction {
    abstract val color: String
    override fun eat() = println("Yummmm")
}

fun main() {
    delegate()
}

fun delegate() {
    val plecoEXE = PlecostomusEXE()
    println("Fish has color ${plecoEXE.color}")
    plecoEXE.eat()
}

interface FishActionXW {
    fun eat()
}

interface FishColorEXE {
    val color: String
}

class PlecostomusEXE(fishColor: FishColorEXE = GoldColor) :
    FishActionXW by PrintingFishAction("a lot of algae"),
    FishColorEXE by GoldColor {
//    override fun eat() {
//        println("eat algae")
//    }

//    override val color: String
//        get() = "gold"
}

object GoldColor : FishColorEXE {
    override val color = "Golding"
}

object RedColor : FishColorEXE {
    override val color = "red"
}

class PrintingFishAction(val food: String) : FishActionXW {
    override fun eat() {
        println(food)
    }
}