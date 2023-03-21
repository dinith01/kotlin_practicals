var userInput : Int = 0
var i = 2
var cal : Int = 0
fun main(){

    println("enter your number : ")

    userInput = Integer.valueOf(readln())

    while (i == (userInput - 1)){
        cal = userInput % i

        println(cal)

        if (cal == 0){
            println("It is not a prime number")
            break
        }
        i++

    }
    println("It is a prime number")

}