package Classes


fun main() {
    buildAquarium()
}

fun buildAquarium() {
    val myAquarium = Aquarium()

    println(
        "Length: ${myAquarium.lenght} " +
            "Width: ${myAquarium.width} " +
            "Height: ${myAquarium.height} "
    )

    myAquarium.height = 80

    println("New Height: ${myAquarium.height} cm")
    println("Volume: ${myAquarium.volume} liters")

    val smallAquarium = Aquarium(lenght = 20, width = 15, height = 30)
    println("Small Aquarium : ${smallAquarium.volume} liters")

    println("===== AQUARIUM TWO =====")

    var myAquariumTwo = Aquarium(numberOfFish = 9)
    println(
        "Small Aquarium Two: ${myAquariumTwo.volume} liters with \n" +
            "Length: ${myAquariumTwo.lenght} " +
            "Width: ${myAquariumTwo.width} " +
            "Height: ${myAquariumTwo.height}"
    )
}