package com.artemis.software.kotlinadvanced.metaprogramming

fun<T> printList(list: List<T>){

    if(list is List<*>){
        println("This is a list")
    }
}

fun main(args: Array<String>) {

   val listStrings = listOf("One", "Two", "three")
   val listNumbers = listOf(1, 2, 3)

    printList(listNumbers)
}