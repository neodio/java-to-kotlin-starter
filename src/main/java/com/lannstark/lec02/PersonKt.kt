package com.lannstark.lec02

import com.lannstark.lec01.Person

fun main() {
    val person = Person("공부하는 개발자")
    startsWithA(person.name)
}

fun startsWithA(str: String): Boolean {
    return str.startsWith("A")
}