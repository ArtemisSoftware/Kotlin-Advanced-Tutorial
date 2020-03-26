package com.artemis.software.kotlinadvanced.classes

import kotlin.math.log

class Log private constructor(){

    companion object Factory {
        @JvmStatic fun createFileLog(filename: String) : Log = Log(filename)
    }

    constructor(filename: String): this() {

    }
}


fun main(args: Array<String>) {

    val log = Log.createFileLog("filename.txt")

}