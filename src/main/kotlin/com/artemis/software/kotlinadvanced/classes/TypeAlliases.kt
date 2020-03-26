package com.artemis.software.kotlinadvanced.classes

typealias Name = String
typealias EmailData = String

data class Employee(val name: Name, val email: EmailData){
    fun printName(string: String){

    }
}


fun main(args: Array<String>) {

    val employee = Employee("Milo", "hase@dd.com")

    employee.printName("A String")
}