package com.oktaygenc.fmssbiliimandroiddevelopmentbootcamp.odev2

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("Cokgenin kenar sayisini girin: ")
    val sideCount = scanner.nextInt()

    val innerAngle = calculateInnerAngle(sideCount)
    println("$sideCount kenarli seklin her bir ic acisi: $innerAngle derece")
}

fun calculateInnerAngle(sideCount: Int): Double {
    return ((sideCount - 2) * 180.0) / sideCount
}