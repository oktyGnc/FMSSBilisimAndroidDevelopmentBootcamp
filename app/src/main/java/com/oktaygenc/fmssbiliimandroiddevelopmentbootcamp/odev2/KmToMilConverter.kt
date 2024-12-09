package com.oktaygenc.fmssbiliimandroiddevelopmentbootcamp.odev2

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("Lutfen kilometreyi girin: ")
    val kilometers = scanner.nextDouble()

    val miles = convertKilometersToMiles(kilometers)
    println("$kilometers km = $miles mil")
}

fun convertKilometersToMiles(kilometers: Double): Double {
    return kilometers * 0.621
}