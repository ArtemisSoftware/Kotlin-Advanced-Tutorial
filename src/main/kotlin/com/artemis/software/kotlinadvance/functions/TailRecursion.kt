package com.artemis.software.kotlinadvance.functions

fun factorial(number: Int): Int {

    when(number){
        0, 1 -> return 1
        else -> return number * factorial(number - 1)
    }
}

fun factorialLTR(number: Int, accumulator: Int = 1): Int {
    when(number){
        0 -> return accumulator
        else -> return factorialLTR(number -1, accumulator * number)
    }
}

fun main(args: Array<String>){
    println(factorial(5))
    println(factorialLTR(5))
}