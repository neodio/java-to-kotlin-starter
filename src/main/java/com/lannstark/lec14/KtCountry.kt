package com.lannstark.lec14

fun handleCountry(country: KtCountry) {
    when (country) {
        KtCountry.KOREA -> TODO()
        KtCountry.AMERICA -> TODO()
    }
}

enum class KtCountry(
    private val code: String,
) {
    KOREA("KO"),
    AMERICA("US")
    ;
}