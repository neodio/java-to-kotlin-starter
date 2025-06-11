package com.lannstark.lec20

import com.lannstark.lec09.PersonKt

fun main() {
    mutableListOf("one", "two", "three")
        .also { println("the list elements before adding new one: $it") }
        .add("four")

    val numbers = mutableListOf("one", "two", "three")
    println("The list elements before adding new one: $numbers")
    numbers.add("four")
}

fun printPerson(person: PersonKt) {
    person?.let {
        println(it.name)
        println(it.age)
    }
    if (person != null) {
        println(person.name)
        println(person.age)
    }
}