package Basics

import kotlin.math.pow

fun main() {
    val array = Array(7) { 1000.0.pow(it) }
    val sizes = arrayOf("byte", "kilobyte", "megabyte", "gigabyte", "terabyte", "petabyte", "exabyte")

    for ((i, value) in array.withIndex()) {
        println("1 ${sizes[i]} = ${value.toLong()} bytes")
    }
}
/*
* Which of these options are good reasons to explicitly make a list immutable? There may be more than 1 correct answer.
*
* - It reduces errors in general
* - Prevents accidental changing of objects that were meant to be unchangeable
* - In a multi-threaded environment, makes the variable thread safe, because once it has been assigned by the initial thread can change it.
*
* */