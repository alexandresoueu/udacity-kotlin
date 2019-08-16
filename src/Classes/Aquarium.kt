package Classes

fun main(args: Array<String>) {
    val myAquarium: Aquarium = buildAquarium()
    println("volume: ${myAquarium.volume}")
}

internal fun buildAquarium() = Aquarium()

class Aquarium(val width: Int = 0, var height: Int = 40, val lenght: Int = 100) {

    var volume: Int
        get() = width * lenght / 1000
        set(value) {
            height = (value * 1000) / (width * lenght)
        }

//    fun volume(): Int {
//        return width * lenght / 1000
//    }

//    fun volume() = width * lenght / 1000
}