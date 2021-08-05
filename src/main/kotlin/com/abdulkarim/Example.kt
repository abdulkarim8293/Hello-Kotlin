package com.abdulkarim

fun main(args: Array<String>) {


    var person = Person()
    person.name = "Karim"
    person.age = 26
    person.canSpeak()
    person.display()

}

// database store

class Person(){

    var name:String = ""
    var age: Int = -1

    fun display(){
        println(name)
        println(age)
    }

    fun canSpeak(){
        println("I can speak")
    }
}

