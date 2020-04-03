package com.artemis.software.kotlinadvanced.generics

import java.io.Serializable


open class Entity(val id: Int)

class CustomerEntity(id: Int) : Entity(id){}


class Repository <T> where T: Entity{

    fun save(entity: T){
        if(entity.id != 0){

        }
    }
}

fun <T: Serializable> streamObject(obj: T){

}

fun main(args: Array<String>) {

    val repository = Repository<CustomerEntity>()
}