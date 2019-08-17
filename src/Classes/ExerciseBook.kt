package Classes

/*
Practice Time

Let's talk about books for a moment, those heavy tomes of paper with printed letters.

    Create a class, Book, with a title and an author.
    Add a method, readPage(), that increases the value of a private variable, currentPage, by 1.
    Create a subclass of Book; name it eBook.
    eBook also takes in a format, which defaults to "text".
    In eBooks, counting words makes more sense than pages. Override the readPage() method to increase the word count by 250, the average number of words per page from typewriter days.

*/

fun main() {
    val book = Book("Nemo", "Disney")
    println("This Book Called ${book.title} and was write by ${book.author}")

    val ebook = eBook("Toy Story", "Disney Pixar", "E-Book")
    println("This Book called ${ebook.title} was to by ${ebook.author} and your format is ${ebook.format}")
}


open class Book(val title: String, val author: String) {

    private var currentPage = 1

    open fun readPage() {
        currentPage++
    }
}

class eBook(title: String, author: String, var format: String = "text") : Book(title, author) {

    private var wordsRead = 0

    override fun readPage() {
        wordsRead = wordsRead + 250
    }
}
