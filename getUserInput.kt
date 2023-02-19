//do some basic mathematical calculations using user inputs
var value1 = 100
var value2 = 20



fun addition (value1:Int,value2:Int){
    println ("addition -  ${value1 + value2}")
}

fun subtraction (value1:Int, value2:Int){
    println("subtraction - ${value1 - value2}" )
}

fun multiplecation (num1:Int, num2:Int){
    println("multiplication - ${value1 * value2}" )
}

fun divition (num1:Int, num2:Int){
    println("divition - ${value1 / value2 }")
}

fun main(){

    println("Enter your first value?")
    value1 = Integer.valueOf(readln())

    println("Enter your second value?")
    value2 = Integer.valueOf(readln())


    addition(value1, value2)
    subtraction(value1, value2)
    multiplecation(value1,value2)
    divition(value1,value2)
}