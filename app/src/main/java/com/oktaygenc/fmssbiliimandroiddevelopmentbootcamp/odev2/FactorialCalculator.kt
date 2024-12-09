package com.oktaygenc.fmssbiliimandroiddevelopmentbootcamp.odev2

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("Faktoriyelini hesaplamak istediginiz sayiyi girin: ")
    val number = scanner.nextInt()

    val factorial = calculateFactorial(number)
    println("$number sayisinin faktoriyeli: $factorial")
}

fun calculateFactorial(number: Int): Long {
    return if (number == 0 || number == 1) {
        1
    } else {
        number * calculateFactorial(number - 1)
    }
}