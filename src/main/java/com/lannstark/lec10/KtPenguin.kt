package com.lannstark.lec10

class KtPenguin (
    species: String
) : KtAnimal(species, 2), KtSwimable, KtFlyable {

    private val wingCount: Int = 2

    override fun move() {
        println("펭귄이 움직인다~ 꿱꿱")
    }

    override val legCount: Int
        get() = super.legCount + this.wingCount

    override fun act() {
        super<KtSwimable>.act()
        super<KtFlyable>.act()
    }
}