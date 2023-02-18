//do some basic mathematical calculations
val num1 = 100
val num2 = 20

fun sum(num1:Int,num2:Int){
    println (num1 + num2)
}

fun sub (num1:Int, num2:Int){
    println(num1 - num2 )
}

fun mul (num1:Int, num2:Int){
    println(num1 * num2 )
}

fun div (num1:Int, num2:Int){
    println(num1 / num2 )
}

fun main(){
    sum(num1, num2)
    sub(num1, num2)
    mul(num1,num2)
    div(num1,num2)
}