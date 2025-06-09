package com.lannstark.lec12

fun main() {
    println(Singleton.a)
    Singleton.a += 10
    println(Singleton.a)
}

class KtPerson private constructor(
    var name: String,
    var age: Int
){

    companion object {
        val MIN_AGE = 1

        @JvmStatic
        fun newBaby(name: String) : KtPerson {
            return KtPerson(name, MIN_AGE)
        }
    }
}

object Singleton {
    var a: Int = 0
}