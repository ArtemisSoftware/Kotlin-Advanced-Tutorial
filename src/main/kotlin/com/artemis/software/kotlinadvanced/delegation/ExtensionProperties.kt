package com.artemis.software.kotlinadvanced.delegation

val String.hasAmpersand: Boolean
    get() = this.contains("&")

fun main(args: Array<String>) {

    println("Hello".hasAmpersand)

    println("Hel&lo".hasAmpersand)
}