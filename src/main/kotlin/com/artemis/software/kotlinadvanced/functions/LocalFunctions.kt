package com.artemis.software.kotlinadvanced.functions

fun foo(fooParam: String){

    val outerFunction = "Value"

    fun bar(barParam: String){

        println(barParam)
        println(fooParam)
        println(outerFunction)
    }
}

fun main(args: Array<String>){

    foo("some value")
}