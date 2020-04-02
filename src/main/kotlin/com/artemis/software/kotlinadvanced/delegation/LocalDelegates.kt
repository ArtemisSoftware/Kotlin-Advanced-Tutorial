package com.artemis.software.kotlinadvanced.delegation

fun localDelegatedProperties(){

    val lazy by lazy { initLate()}
}

fun initLate(): String {
    return "late init"
}