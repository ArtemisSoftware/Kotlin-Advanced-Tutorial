package com.artemis.software.kotlinadvanced.metaprogramming

import java.lang.reflect.Type

class Transaction(val id: Int, val amount: Double, var description: String){

    fun validate(){
        if(amount > 10000){
            println("Transaction is too large")
        }
    }
}

fun introspectInstance(obj: Any){

    println("Class ${obj.javaClass.simpleName}")

    println("\nProperties\n")
    obj.javaClass.declaredFields.forEach {
        println("${it.name} of type ${it.type}")
    }

    println("\n\nFunctions\n")
    obj.javaClass.declaredMethods.forEach {
        println("${it.name} ")
    }

}

fun getType(obj: Type){
    println(obj.typeName)
}


fun main(args: Array<String>) {
    introspectInstance(Transaction(1, 200.0, "A simple tranacion"))


    getType(Transaction::class.java)
}