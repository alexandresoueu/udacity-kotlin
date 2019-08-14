package Functions

fun main() {
    val decorationsAquarium = listOf("rock", "pagoda", "plastic plant", "alligator", "flowerpot")

    println(decorationsAquarium.filter { it[0] == 'r' })
}