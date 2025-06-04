package com.lannstark.lec10

abstract class KtAnimal (
    protected val species: String,
    protected open val legCount: Int
){
    abstract fun move()

}