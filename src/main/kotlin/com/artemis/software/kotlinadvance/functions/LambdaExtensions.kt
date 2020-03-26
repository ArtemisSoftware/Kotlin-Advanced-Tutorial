package com.artemis.software.kotlinadvance.functions

class Request(val method: String, val query: String, val contentType: String)
class Response(var contents: String, var status: Status){

    operator fun invoke(arg: Status.() -> Unit) {


    }
}

class  Status(var code: Int, var description: String)

class RouteHandler(val request: Request, val response: Response){
    var executeNext = false

    fun next(){
        executeNext = true
    }
}

fun routeHandler(path: String, f: RouteHandler.() -> Unit): RouteHandler.() -> Unit = f


fun main(args: Array<String>){

    routeHandler("/index.html") {
        if(request.query != ""){
            //process
        }

        response {

                code = 404
                description = "Not found"

        }

    }

    val manager = Manager()
    manager("Do something?")
}


class Manager {

    operator fun invoke(value: String){

    }
}