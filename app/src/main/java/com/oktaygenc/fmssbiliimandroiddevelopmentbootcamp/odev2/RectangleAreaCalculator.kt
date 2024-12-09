package com.oktaygenc.fmssbiliimandroiddevelopmentbootcamp.odev2

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("Dikdortgenin uzun kenarini girin: ")
    val length = scanner.nextDouble()

    print("Dikdortgenin kisa kenarini girin: ")
    val width = scanner.nextDouble()

    val area = calculateRectangleArea(length, width)
    println("Dikdortgenin alani: $area")
}

fun calculateRectangleArea(length: Double, width: Double): Double {
    return length * width
}