import java.lang.Exception
import kotlin.random.Random

fun main(args: Array<String>) {

    // Random Number between 0 and 10

    var randomNumber = Random.nextInt(0,10)

    //Start User guesses multiple times

    var countGuess = 0

    //Limit Number of guesses 3 times
    while (countGuess < 3) {
        print("Guess a number between 0 and 10 or quit : ")

        val guess = readLine()!!

        // if user enter quit word will break The project

        if (guess == "quit"){
            break
        }
        // try if user Enter number correctly show a message  "You Get It" and break thr project
        try {

            if (guess!!.toInt() == randomNumber) {
                println("You Get It")

                break

            }
             // else user guesses time three show a message  wrong guess and show the random number,
            //  else give another chance to guess correctly
            else {
                if (countGuess == 2) {
                    println("Wrong guess. The answer was $randomNumber ")
                    break
                } else {
                    println("Try again")

                }
            }
            countGuess ++

        }
        catch (e: Exception) {
            println("Please Enter Number only.")

        }

    }
    // Display a message to the users that the game is over

    print("Game Over")
}