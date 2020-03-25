package com.artemis.software.kotlinadvance.functions

inline fun operation(op: () -> Unit){

    println("Before calling op()")
    op()
    println("After calling op()")
}

fun tryingToInline(op: () -> Unit){
    val reference = op
    println("Asingn value")
    op()
}

fun anotherFunction(){
    operation { println("This is the actual op function") }
}

fun main(args: Array<String>){
    operation { println("This is the actual op function") }

}