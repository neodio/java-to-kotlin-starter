package com.lannstark.lec14

fun main() {
    val dto1 = KtPersonDto("홍길동", 100)
    println(dto1)
}

data class KtPersonDto (
    val name: String,
    val age: Int,
)