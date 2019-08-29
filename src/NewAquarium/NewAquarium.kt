package NewAquarium

data class Fish(var name: String)

fun main() {
    fishExample()
}

fun fishExample() {
    val fish = Fish("bubble")
    myWith(fish.name) {
        println(capitalize())
    }

    println(fish.run { name })

    println(fish.apply {})

    val fishTwo = Fish(name = "bubble").apply { name = "sniff" }
    println(fishTwo.name)
    println(fish.let { it.name.capitalize() }
        .let { it + "fish" }
        .let { it.length }
        .let { it + 31 })

}

fun myWith(name: String, block: String.() -> Unit) {
    name.block()
}