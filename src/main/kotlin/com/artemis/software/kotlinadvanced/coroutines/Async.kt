package com.artemis.software.kotlinadvanced.coroutines

import java.util.concurrent.CompletableFuture

//import java.util.concurrent.CompletableFuture


private fun startLongAsyncOperation(v: Int) = CompletableFuture.supplyAsync{
    Thread.sleep(1000)
    "Result:$v"
}

fun main(args: Array<String>) {
/*
    val deferred = (1..5).map { n ->
        GlobalScope.async {
            println("n: $n")
        }
    }

    println("Start")
    println(deferred.get())
    println("End")

*/
/*
    val future = async<String> {
        (1 ... 5).map{
            await(startLongAsyncOperation(it))
        }
    }
    println("Start")
    println(future.get())
    println("End")
*/
}