package Classes.Constants

import Classes.Constants.BASE.Companion.title


/*Quiz Question

Let’s continue with our books setup to practice creating constants in Kotlin. There are 3 different ways in which you can create constants in Kotlin. It’s not the most exciting topic, but you’ll use constants all the time.

For each situation, decide when you would use a constant, an enum, and a data class.

1- Storing simple values without any functionality. For example, a URL or a numeric code. ANSWER: Constants
2- They are objects that store groups of values that are related. They offer type safety. ANSWER: Enum
3- Creating objects that only have properties without additional functionality. ANSWER: Data Classes

Practice Time

    Create a top-level constant for the maximum number of books a person could borrow.
    Inside the Book class, create a method canBorrow() that returns true or false depending on whether a user has already borrowed the max number of books.
    Create a Constants object that provides constants to the book. For this example, provide the BASE_URL for all books in the library catalog. Inside Book, add a method printUrl that creates and prints a URL composed of BASE_URL, the book title, and “.html”.
    The base URL is really of interest to the Book class. As such, it makes sense to limit its scope to the Book class. Use a companion object to define the constant in Book.

*/

const val MAX_NUMBER_BOOKS = 20

fun canBorrow(hasBooks: Int): Boolean {
    return (hasBooks < MAX_NUMBER_BOOKS)
}

object ConstantsEXE {
    const val BASE_URL = "http://www.turtlecare.net/"
}

fun printUrl() {
    println(ConstantsEXE.BASE_URL + title + ".html")
}

class BASE {
    companion object {
        val BASE_URL = "http://www.turtlecare.net/"
        val title = "turtle"
    }
}

