package Functions

import java.util.*

fun main(args: Array<String>) {
    println("Hello, ${args[0]}")
    feedTheFish()
}

fun feedTheFish() {
    val day = randomDay()
    val food = randomFood(day)

    println("Today is ${day} and the fish eat ${food}")
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