package Functions

import java.util.*

fun main(args: Array<String>) {
    println("Hello, ${args[0]}")
    feedTheFish()
}

fun shouldChangeWater(day: String, temperature: Int = 22, dirty: Int = 20): Boolean {
    return true
}

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