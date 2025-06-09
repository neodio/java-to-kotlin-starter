package com.lannstark.lec13


class KtJavaHouse(
    private val address: String,
    private val livingRoom: LivingRoom,
) {

    class LivingRoom(
        private val area: Double
    )
}