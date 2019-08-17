package Classes

/*
Practice Time

Earlier, we created and filtered a list of spices. Spices are much better represented as objects than as simple strings. Because they are objects, we can perform different things with them - such as cooking.

To recap, let's make a simple Spice class. It doesn't do much, but it will serve as the starting point for the next practice.

    Create class, SimpleSpice.
    Let the class be a property with a String for the name of the spice, and a String for the level of spiciness.
    Set the name to curry and the spiciness to mild.
    Using a string for spiciness is nice for users, but not useful for calculations. Add a heat property to your class with a getter that returns a numeric value for spiciness. Use a value of 5 for mild.
    Create an instance of SimpleSpice and print out its name and heat.


Practice Time Two

Let's improve our SimpleSpice class so that we can have various spices with different levels of spiciness.

    Create a new class, Spice.
    Pass in a mandatory String argument for the name, and a String argument for the level of spiciness where the default value is mild for not spicy.
    Add a variable, heat, to your class, with a getter that returns a numeric value for each type of spiciness.
    Instead of the list of spices as Strings you used earlier, create a list of Spice objects and give each object a name and a spiciness level.
    Add an init block that prints out the values for the object after it has been created. Create a spice.
    Create a list of spices that are spicy or less than spicy. Hint: Use a filter and the heat property.
    Because salt is a very common spice, create a helper function called makeSalt().



*/

fun main() {

    val simpleSpice = SimpleSpice()
    println(
        "Name: ${simpleSpice.name} " +
            "Heat: ${simpleSpice.heat}"
    )

}


class SimpleSpice() {
    val name = "curry"
    val spiciness = "mild"
    val heat: Int
        get() {
            return 5
        }
}

class Spice(val name: String, val spiciness: String = "mild") {

    private val heat: Int
        get() {
            return when (spiciness) {
                "mild" -> 1
                "medium" -> 3
                "spicy" -> 5
                "very spicy" -> 7
                "extremely spicy" -> 10
                else -> 0
            }
        }
}

val spices1 = listOf(
    Spice("curry", "mild"),
    Spice("pepper", "medium"),
    Spice("cayenne", "spicy"),
    Spice("ginger", "mild"),
    Spice("red curry", "medium"),
    Spice("green curry", "mild"),
    Spice("hot pepper", "extremely spicy")
)

val spice = Spice("cayenne", spiciness = "spicy")

val spicelist = spices1.filter { it.heat < 5 }

fun makeSalt() = Spice("Salt")
