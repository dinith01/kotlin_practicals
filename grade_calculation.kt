var user_int1 = 0
fun main(){

    println("Enter your value : ")
    user_int1 = Integer.valueOf(readln())


    if(user_int1 >= 75){

        println("A")
    }

    else if(user_int1 >= 65){
        println("B")
    }

    else if(user_int1 >= 55){
        println("C")
    }

    else if(user_int1 >= 45){
        println("S")
    }
    else {
        println("W")
    }

}