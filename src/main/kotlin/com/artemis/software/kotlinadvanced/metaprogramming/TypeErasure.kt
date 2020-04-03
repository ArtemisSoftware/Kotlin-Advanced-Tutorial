package com.artemis.software.kotlinadvanced.metaprogramming

fun<T> printList(list: List<T>){

    if(list is List<*>){
        println("This is a list")
    }
}

fun<T> printList(obj: T){

    when (obj){
        is Int -> println("This is an int")
        is String -> println("This is a String")
    }
}

inline fun <reified T> erased(input: List<Any>){
    if(input is T){

    }
}


fun main(args: Array<String>) {

   val listStrings = listOf("One", "Two", "three")
   val listNumbers = listOf(1, 2, 3)

    printList(listNumbers)
}