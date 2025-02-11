/**
 * A little Guessing Game in Kotlin
 */

fun main(){
    println("====================")
    println("Kotlin Coded Guessing")
    println("====================")

    val numbToGuess = (1..100).random()
    println("I am thinking of a number from 1 to 100!!")
    val msg = ("Can you guess what number I am thinking of?")
    println(msg)
    while (true){
        // ask the user for input

        val userGuess = readln().toInt()
        // Check if the user's input is correct
        if (userGuess == numbToGuess){
            println("You guessed correctly!")
            break
        }
        //Break out of the loop if correct

        //Otherwise give higher or lower feedback

    }



}