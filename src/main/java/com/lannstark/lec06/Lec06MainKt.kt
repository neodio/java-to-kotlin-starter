package com.lannstark.lec06

fun main() {
    for (i in 1..3) {
        println(i)
    }

    for (i in 3 downTo 1) {
        println(i)
    }

    for (i in 1 .. 5 step 2) {
        println(i)
    }

    var i = 1
    while (i <= 3) {
        println(i)
        i++
    }
}