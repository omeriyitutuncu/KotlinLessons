package com.example.kotlinlearning.lessons.day2

enum class Suit{
    Club,Diamond,Heart,Spade
}

fun main() {

    val x = 9
    when(x){
        1 -> println("X === 1")
        2 -> println("X == 2")
        3,4-> println("X == 3")
    }

    val card = Suit.Spade

   val y = when(card){
        Suit.Club,Suit.Spade -> println("black")
       Suit.Diamond,Suit.Heart-> println("red")
    }

    val name = "omer"

    val lastName = when(name){
        "Hattan" -> "Okkes"
        "Mahmut" -> "Murtaza"
        "omer" ->"Ali"
        else -> "Murat"
    }
    println("$name $lastName")



    var age = when(x){

        in 1..3 -> 3
        in 2..5->true
        in 4..7->"mahmut"
        else -> 4.5

    }


    println(age)
}