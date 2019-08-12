package Functions

import java.util.*

fun main() {
    helloWorld()
    dayOfWeek()
}

fun helloWorld() {
    println("Hello World!")
}

fun dayOfWeek() {
    val day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)

    println(
        "Today is " +
            when (day) {
                1 -> "Sunday"
                2 -> "Monday"
                3 -> "Tuesday"
                4 -> "Wednesday"
                5 -> "Thursday"
                6 -> "Friday"
                7 -> "Saturday"
                else -> "Time has stopped!"
            }
    )
}

