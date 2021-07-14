package com.abdulkarim

fun main(args: Array<String>) {

    val isChecked = true

    if (isChecked) {
        println("Checked")
    } else {
        println("Unchecked")
    }

    if (isChecked) println("Checked") else println("Unchecked")

    val number = 1..10

    /*for (n in number){
        if (n%2==0)
            print(" $n")
    }*/
    //var num = 0
    /*while (num<=10){
        print(" $num")
        num++
    }*/
    /*do {
        print(" $num")
        num++
    }while (num<=10)*/
/*    var x = 10

    var str = when (x) {
        in 1..11 -> "X is 1 - 11"
        20 -> "X is 20"
        else ->"it is default"
    }
    println(str)*/

/*    var maxNumber = Example().max(10,5)
    println(maxNumber)
    val list:ArrayList<String> = ArrayList()
    list.add("Name 1")
    list.add("Name 2")
    list.add("Name 3")
    for (item in list){
        println(item)
    }*/


}


class Example {

    fun max(a:Int,b:Int):Int = if (a>b) a else b

}

