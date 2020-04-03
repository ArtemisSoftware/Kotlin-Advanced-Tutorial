package com.artemis.software.kotlinadvanced.coroutines
import java.util.concurrent.CompletableFuture

private fun startLongAsyncOperation(v: Int) = CompletableFuture.supplyAsync{
    Thread.sleep(1000)
    "Result:$v"
}

fun main(args: Array<String>) {

/*
    val future = async<Strings> {
        (1 ... 5).map {
        a
    }
    }
    */
}