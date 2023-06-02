package com.example.kotlinlearning.lessons.day2

fun main() {


    for (i in 1..10){
        println(i)
    }

    val  students = listOf("Omer","Ali","Okkes")

    for (student in students){
        println(student)
    }

    for ((index,student)in students.withIndex()){

        println("$index with $student")


    }

    var count =5

    while (count>0){
        println(count)
        count --

    }



}