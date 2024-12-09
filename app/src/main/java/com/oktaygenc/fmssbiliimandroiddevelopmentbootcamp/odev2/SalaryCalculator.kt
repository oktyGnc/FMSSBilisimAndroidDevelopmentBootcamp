package com.oktaygenc.fmssbiliimandroiddevelopmentbootcamp.odev2

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("Calisilan gun sayisini girin: ")
    val workDays = scanner.nextInt()

    val salary = calculateSalary(workDays)
    println("$workDays gunluk maas: $salary TL")
}

fun calculateSalary(workDays: Int): Double {
    val normalWorkHoursPerDay = 8.0
    val normalHourlyRate = 40.0
    val overtimeHourlyRate = 80.0

    val totalWorkHours = workDays * normalWorkHoursPerDay

    return if (totalWorkHours <= 150) {
        totalWorkHours * normalHourlyRate
    } else {
        val normalHours = 150.0
        val overtimeHours = totalWorkHours - 150.0

        (normalHours * normalHourlyRate) +
                (overtimeHours * overtimeHourlyRate)
    }
}