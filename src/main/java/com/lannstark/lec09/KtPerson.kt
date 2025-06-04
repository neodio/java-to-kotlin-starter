package com.lannstark.lec09

fun main() {
    val person = PersonKt("이름", 100)
    println(person.name)
    person.age = 10
    println(person.age)

    PersonKt()
}


class PersonKt(
    val name: String,
    var age: Int
) {
    init {
        if (age <= 0) {
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다.")
        }
        println("초기화 블록")
    }

    constructor(name: String): this(name, 1) {
        println("첫 번째 부생성자")
    }

    constructor(): this("홍길동") {
        println("두 번째 부생성자")
    }

    fun isAdult(): Boolean {
        return this.age >= 20
    }

    val isAdult: Boolean
        get() = this.age >= 20

    val isAdult2: Boolean
        get() {
            return this.age >= 20
        }
}

/* 원본
class PersonKt constructor(name: String, age: Int) {
    val name: String = name
    var age: Int = age
}
*/
