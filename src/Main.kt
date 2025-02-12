/**
 * A little Guessing Game in Kotlin
 */

fun main() {
    println("====================".red())
    println("Kotlin Coded Guessing")
    println("====================")

    val numbToGuess = (1..100).random()
    println("I am thinking of a number from 1 to 100!!")
    val msg = ("Can you guess what number I am thinking of?")
    println(msg)

    // Define a counter variable
    var guessCounter = 1
    while (true) {
        // ask the user for input
        val userGuess = readln().toIntOrNull()
        // Check if the user's input is correct
        if (userGuess == null) {
           println("That's not a number!!")

        } else {
            //Break out of the loop if correct
            if (userGuess == numbToGuess) {
                println("You guessed correctly!")
                if (guessCounter == 1) {
                    println("Awesome you got it on your first try!!")
                    break
                } else if (guessCounter > 10) {
                    println("You took $guessCounter tries get better!!")
                    break
                }
            }
            //Otherwise give higher or lower feedback
            if (userGuess < numbToGuess) {
                println("Higher!!!")
            } else {
                println("Lower!!!")
            }
            guessCounter++
        }
    }

}