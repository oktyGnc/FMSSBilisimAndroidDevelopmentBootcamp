package com.oktaygenc.fmssbiliimandroiddevelopmentbootcamp.odev2

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("Kelimeyi Girin: ")
    val word = scanner.nextLine()

    val eCount = countELetters(word)
    println("Kelimede $eCount adet 'e' harfi bulunmaktadir.")
}

fun countELetters(word: String): Int {
    return word.lowercase().count { it == 'e' }
}