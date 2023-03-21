package com.example.tochnodz1

abstract class Animal (val name: String,  val desc: String){

    val v1 = "qwe"
    val v2: String

    init{
        name
        desc

        v2 = "zxc"
    }

    abstract fun go(seconds:Int): Boolean

    companion object{
        val legCount = 4

        fun getBiologicalClass(): String{
            return "legacy"
        }
    }
}

object Plate {
    val v1 = "qwe"
    val v2: String = "wasd"

    fun getSomeFood(){

    }
}

