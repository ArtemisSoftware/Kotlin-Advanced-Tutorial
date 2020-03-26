package com.artemis.software.kotlinadvance.classes


class DirectoryExplorer(val user: String){



    inner class PermissionCheck(){

        fun validatePermission(){

            if(user != "Shaka"){

            }
        }
    }
    fun listFolder(folder: String, user: String){

        val permissionCheck = PermissionCheck()
        permissionCheck.validatePermission()
    }
}


fun main(args: Array<String>) {

    val de = DirectoryExplorer("Aldebaran")

    val pc = DirectoryExplorer("Milo").PermissionCheck()
}