package com.example.kotlinlearning.lessons.Chapter3.part5

val strins = listOf(
    "omer",
    "ali \n okkes",
    """
        ben bir 
        gariban 
        herkese selam 
    """,
    """
        |ben bir 
        |gariban 
        |herkese selam 
    """.trimMargin()

)

fun main() {
    strins.forEach(::println)
}