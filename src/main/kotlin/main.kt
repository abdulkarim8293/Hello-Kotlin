
/*
* Created by Abdul Karim
* basic syntex
* */

fun main(args: Array<String>) {

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