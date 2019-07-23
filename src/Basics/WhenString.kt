package Basics

/*
when statements in Kotlin are like case or switch statements in other languages.

Create a when statement with three comparisons:

If the length of the fishName is 0, print an error message.
If the length is in the range of 3...12, print "Good fish name".
If it's anything else, print "OK fish name".

*/


fun main() {

    val fishName = "The fishName is Nemo"

    when (fishName.length) {
        0 -> println("It is empty!")
        in 1..50 -> println("${fishName}")
        else -> println("Error message")
    }

}