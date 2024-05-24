package com.lannstark.lec03

fun main() {
    val number1: Int = 3
    val number2: Long = number1.toLong()
    printAgeIfPerson1(null)
    printAgeIfPerson1(Person("", 100))

    val person = Person("홍길동", 100)
    println("이름 : ${person.name}")

    val text = """
        test
        test1
    """.trimIndent()
    println(text)
}

fun printAgeIfPerson(obj: Any) {
    if (obj !is Person) {
        val person = obj as Person
        println(person.age)
    }
}

fun printAgeIfPerson1(obj: Any?) {
    val person = obj as? Person
    println(person?.age)
}