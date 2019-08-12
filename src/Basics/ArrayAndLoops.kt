package Basics

import java.util.*

fun main() {

    List()
    println("***********************************")
    ListRemove()
    println("***********************************")
    ListsAndArraysCollections()
    println("***********************************")
    //school()
    println("***********************************")
    mixTypes()
    println("***********************************")
    Array()
    println("***********************************")
}

fun List() {
    val myList = mutableListOf("Marlin", "Dori", "Nemo")
    //myList = mutableListOf("Boris", "Rambo") Error Val Cannot be reassigned
    println(myList)
}

fun ListRemove() {
    val myRemoveList = mutableListOf("One", "Two", "Three")
    myRemoveList.remove("Two")
    println(myRemoveList)
}

fun ListsAndArraysCollections() {
    var fish = 12
    var plants = 5
    val swarm = listOf(fish, plants)

    val bigSwarm = arrayOf(swarm, arrayOf("Nuki", "Biro", "Lero"))
    println(swarm)
    println("----------------")
    println(bigSwarm)
    println(Arrays.toString(bigSwarm))

    for (index in swarm) println("- " + index)

    for ((index, element) in swarm.withIndex()) {
        println("Fish at $index is $element")
    }

    for (i in 'a'..'f') print(i)
    println("  == for letters ==")
    for (i in 1..6) print(i)
    println(" == for numbers ==")
    for (i in 5 downTo 1) print(i)
    println(" == for downTo ==")
    for (i in 3..6 step 2) print(i)
    println(" == for step ==")

}

fun school() {
    val school = arrayOf("car", "dog", "fire")
    val numbers = intArrayOf(1, 2, 3)

    //println(Arrays.toString(intArrayOf(2, "str")))
}


fun mixTypes() {
    val mix = arrayOf("Nemo", 10)
    println(mix)
    println(Arrays.toString(mix))
}

fun Array() {
    val array = Array(5) { it * 2 }
    println(array.asList())
}