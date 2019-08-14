package Functions

import java.util.*

fun main(args: Array<String>) {
    println("Hello, ${args[0]}")
    feedTheFish()
    println("===============================")
    eagerExample()
    println("===============================")

    var bubbles = 0
    while (bubbles < 50) {
        bubbles++
    }

    repeat(2) {
        println("A fish is swimming!")
    }
}

fun eagerExample() {
    val decorations = listOf("rock", "pagoda", "plastic plant", "alligator", "flowerpot")
    val eager = decorations.filter { it[0] == 'p' }

    println(eager)

    val filtered = decorations.asSequence().filter { it[0] == 'p' }
    println("bad ... " + filtered)
    println("good " + filtered.toList())

    val lazyMap = decorations.asSequence().map {
        println("map: $it ")
        it
    }

    println(lazyMap)
    println("First ${lazyMap.first()}")
    println("All ${lazyMap.toList()}")
}

fun getDirtySensorReading() = 20

fun shouldChangeWater(day: String, temperature: Int = 22, dirty: Int = getDirtySensorReading()): Boolean {

//    val isTooHot = temperature > 30
//    val isDirty = dirty > 30
//    val isSunday = day == "Sunday"

    return when {
        isTooHot(temperature) -> true
        isDirty(dirty) -> true
        isSunday(day) -> true
        else -> false
    }
}

fun isTooHot(temperature: Int) = temperature > 30

fun isDirty(dirty: Int) = dirty > 30

fun isSunday(day: String) = day == "Sunday"

fun shouldChangeWaterTwo(temperature: Int = 22, dirty: Int = 20, day: String) {
}

fun feedTheFish() {
    val day = randomDay()
    val food = randomFood(day)

    println("Today is ${day} and the fish eat ${food}")

    shouldChangeWater(day, 20, 50)
    shouldChangeWater(day)
    shouldChangeWater(day, dirty = 50)
    shouldChangeWaterTwo(day = "Monday")

    if (shouldChangeWater(day)) {
        println("Change the water")
    }
}

fun randomDay(): String {
    val week = listOf("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")
    return week[Random().nextInt(7)]

}

fun randomFood(day: String): String {

    return when (day) {
        "Monday" -> "flakes"
        "Tuesday" -> "pellets"
        "Wednesday" -> "redworms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        "Saturday" -> "lettuce"
        //"Sunday" -> "plankton"
        else -> "fasting"
    }

}