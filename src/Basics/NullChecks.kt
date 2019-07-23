package Basics


/*Create a nullable integer variable called nullTest, and set it to null.
Use a null-check that increases the value by one if it's not null, otherwise returns 0, and prints the result.

Hint: Use the Elvis operator.*/

fun main() {
    val nullTest: Int = 0
    println(nullTest?.inc() ?:0)
}