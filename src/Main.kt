/**
 * A little Guessing Game in Kotlin
 */

fun main() {
    println("====================")
    println("Kotlin Coded Guessing")
    println("====================")
    val playerName = getString("Enter your name: ")
    println("Nice to meet you $playerName")

    val favColour = getString("Enter your colour: ")
    println("$favColour is a great colour.")

    val numbToGuess = (1..100).random()
    println("I am thinking of a number from 1 to 100!!")
    val msg = ("Can you guess what number I am thinking of?")
    println(msg)

    // Define a counter variable
    var guessCounter = 1
    while (true) {
        // ask the user for input
        val userGuess = getInt("Guess the number: ")
        // Check if the user's input is correct


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



/**
 *  Function to get String from user
 *
 *  parameters:
 *  - prompt is text to show the user
 *  returns:
 *  String that the uer types
 */

fun getString(prompt: String): String {
    var userInput:  String
    while (true){
        print(prompt)
        userInput = readln()
        if (userInput.isNotBlank()) break
    }
    return userInput
}

fun getInt(prompt: String): Int{
    var intValue: Int?
    while (true) {
        val userInput = getString(prompt)
        intValue = userInput.toIntOrNull()
        if (intValue != null) break
    }
    return intValue!!
}