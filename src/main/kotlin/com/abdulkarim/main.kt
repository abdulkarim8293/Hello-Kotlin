package com.abdulkarim
/*
* Created by Abdul Karim
* basic syntex
* */

fun main(args: Array<String>) {

    // variable and data type
    val quantity:Int = 10
    val price = 123.12
    val floatNumber = 123.123f
    val isChecked = true
    val character = 'A'

    val myName = "Abdul Karim"
    Message(myName).display()

}

class Message(private val text: String) {

    init {
        println("Hello!")
    }

    fun display() {
        println("My name is $text")
    }

}