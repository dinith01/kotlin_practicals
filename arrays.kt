

fun main(){

    var fruits = arrayOf("apple","grapes","pineapple")

    //print array size
    println("fruits array size is : ${fruits.size}")

    //print 4th element array
    println ("fruits array 4th value is: ${fruits[2]} ")

    //change 1st element value
    fruits[1] = "Mango"


    println("\n \n prints array elemets by using for loop....")
    //prints array elemets by using for loop
    for (i in fruits){
        println(i)
    }




}