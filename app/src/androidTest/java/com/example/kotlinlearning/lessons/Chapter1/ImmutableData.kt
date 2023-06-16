package com.example.kotlinlearning.lessons.Chapter1

fun main() {
    val greetings = "Hello world"

    val owe = 50
    val janet = "I owe janet \$$owe dollars"
    println(janet)

    val infinity = "the symbol is \u221E"
    println(infinity)

    println("[$greetings] has ${greetings.length} characters")

    val compare1= "alpha"
    val compare2= "alpha"

    println(compare1.compareTo(compare2))


    val sub = greetings.subSequence(3,7)

    println("Sub: $sub")


    for (single in greetings){
        println("letters $single")
    }


    val mString = """
    My name is omer
    From Turkey
    Nasilsin    
    """

    println(mString)


}