package com.example.kotlinlearning.lessons.Chapter3.part5

import android.graphics.Color
import android.provider.CalendarContract.Colors


data class Person(val name: String, val age: Int)

fun main() {

    val person1 = Person("omer", 55)
    val person2 = Person("ali", 40)

    val oldest: Person = if (person1.age > person2.age) person1 else person2
    println("oldest ${oldest.name}")
}

fun getColor(person: Person): String = when (person.age) {
    1, 2 -> "Bebek"
    18 -> "Genc"
    in 20..30 -> "yetiskin"
    else -> {
        println()
        "Olu"
    }
}