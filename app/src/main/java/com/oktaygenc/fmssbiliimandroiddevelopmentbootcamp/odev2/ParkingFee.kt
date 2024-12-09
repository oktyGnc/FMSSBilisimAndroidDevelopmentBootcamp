package com.oktaygenc.fmssbiliimandroiddevelopmentbootcamp.odev2

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("Otopark suresini saat olarak girin: ")
    val parkingHours = scanner.nextInt()

    val parkingFee = calculateParkingFee(parkingHours)
    println("$parkingHours saatlik otopark ucreti: $parkingFee TL")
}

fun calculateParkingFee(parkingHours: Int): Int {
    return if (parkingHours <= 1) {
        50
    } else {
        50 + ((parkingHours-1) * 10)
    }
}