package com.artemis.software.kotlinadvance.functions

infix fun String.shouldBeEqualTo(value: String) = this == value


fun main(args: Array<String>){

    "Hello".shouldBeEqualTo("Hello")

    "Hello" shouldBeEqualTo "Hello"

    val output = "bye"

    output shouldBeEqualTo "Hello"
}