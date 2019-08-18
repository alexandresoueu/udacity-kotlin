package Classes.DecorationsDataClass

fun main() {
    makeDecorations()
}

fun makeDecorations() {
    val d1 = Decorations("granite")
    println(d1)

    val d2 = Decorations("slate")
    println(d2)

    val d3 = Decorations("slate")
    println(d3)

    println(d1.equals(d2))
    println(d3.equals(d2))

    val d4: Decorations = d3.copy()
    println(d3)
    println(d4)

    val d5 = DecorationsTwo("crystal", "wood", "diver")
    println(d5)

    val (rock: String, wood: String, diver: String) = d5
    println(rock)
    println(wood)
    println(diver)
}

data class Decorations(val rocks: String) {}

data class DecorationsTwo(val rocks: String, val wood: String, val diver: String) {}