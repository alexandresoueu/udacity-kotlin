package Basics


/*
1 - Create a list with two elements that are null; do it in two different ways.
2 - Next, create a list where the list is null.
*/

fun main() {
    listOf(null,null)
    //[null, null] Error
    var list: List<Int?> = listOf(null, null)
    var list2:List<Int>? = null
}