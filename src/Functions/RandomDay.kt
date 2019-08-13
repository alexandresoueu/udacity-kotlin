package Functions

import java.util.*

fun main(args: Array<String>) {
    println("Hello, ${args[0]}")
    feedTheFish()
}

fun feedTheFish() {
    val day = randomDay()
    val food = randomFood()

    println("Today is ${day} and the fish eat ${food}")
}

fun randomDay(): String {
    val week = listOf("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")
    return week[Random().nextInt(7)]

}

fun randomFood(): String {
    val food = listOf("bacon", "pellets", "apple", "mango", "grape", "orange", "cookie")
    return food[Random().nextInt(7)]
}