package com.artemis.software.kotlinadvanced.delegation

import com.artemis.software.kotlinadvanced.classes.Customer

interface Repository {

    fun getById(id: Int): Customer
    fun getAll(): List<Customer>
}


interface Logger {

    fun logAll()
}

class Controller(repository: Repository, logger: Logger): Repository by repository, Logger by logger{

    fun index(){
        getAll()
        logAll()
    }
}