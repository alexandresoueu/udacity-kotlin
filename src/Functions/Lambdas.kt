package Functions

fun main() {
    { println("Hi Lambda ") }()

    val swimLamb = { println("Swimming in Lambda\n ") }

    swimLamb()

    var dirtyLamb = 20

    val waterFilter = { dirtyLamb: Int -> dirtyLamb / 2 }

    println(waterFilter(dirtyLamb))

    val listLamb = listOf(1, 2, 3)

    println(listLamb.filter {
        it == 2
    })
}

