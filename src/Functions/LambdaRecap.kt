package Functions

fun main() {
    { println("Lambda Recap") }()

    val waterFilter = { dirty: Int -> dirty / 2 }
    println("WaterFilter: " + waterFilter(30))

    data class Fish(val name: String)

    val myFish = listOf(Fish("Dory"), Fish("Nemo"), Fish("Marlin"))

    println(myFish.filter { it.name.contains("N") }.joinToString(" ") { it.name })
}