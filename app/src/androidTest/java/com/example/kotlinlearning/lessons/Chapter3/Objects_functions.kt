package com.example.kotlinlearning.lessons.Chapter3

open class Objects_functions {
    open fun hello()="Hello"
}

class Person:Objects_functions(){
    override fun hello()="Hi"
}