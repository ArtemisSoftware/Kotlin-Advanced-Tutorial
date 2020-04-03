package com.artemis.software.kotlinadvanced.generics

import com.artemis.software.kotlinadvanced.classes.Customer

open class Person
class Employees: Person()

fun operator(person: List<Person>){}

interface ReadOnlyRepo<out T> {

    fun getId(id: Int): T
    fun getAll(): List<T>
}

interface WriteRepo<in T> {

    fun save(obj: T)
    fun saveAll(list: List<T>)
}

fun main(args: Array<String>) {


    operator(listOf<Person>())
    operator(listOf<Employees>())

    val readOnlyRepo = ReadOnlyRepoImpl<Customer>()
    readOnlyRepo.getAll()
}