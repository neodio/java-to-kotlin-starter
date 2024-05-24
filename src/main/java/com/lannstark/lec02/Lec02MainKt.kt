package com.lannstark.lec02

fun main() {
    val str: String? = null
    println(str?.length ?: 0)

    startsWithA(null)
}

fun startsWithA1(str: String?): Boolean {
    return str?.startsWith("A")
        ?: throw IllegalArgumentException("null이 들어왔습니다.")
}

fun startsWithA2(str: String?): Boolean? {
    return str?.startsWith("A")
}

fun startsWithA3(str: String?): Boolean? {
    return str?.startsWith("A") ?: false
}

fun startsWithA(str: String?): Boolean {
    return str!!.startsWith("A")
}