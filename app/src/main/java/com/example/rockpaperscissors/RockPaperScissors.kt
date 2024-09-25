package com.example.rockpaperscissors

fun main(){

    var computerChoice = ""

    println("Enter your choice: Rock, Paper or Scissors!")
    val playerChoice: String = readln()

    when ((1..3).random()) {
        1 -> {
            computerChoice = "Rock!"
        }
        2 -> {
            computerChoice = "Paper"
        }
        3 -> {
            computerChoice = "Scissors"
        }
    }

    println(computerChoice)

    val winner = when {
       playerChoice == computerChoice -> "Tie"
       playerChoice == "Rock" && computerChoice == "Scissors" -> "Player"
       computerChoice == "Rock" && playerChoice == "Paper" -> "Player"
       playerChoice == "Scissors" && computerChoice == "Paper" -> "Player"
       else -> "Computer"
    }

    if(winner == "Tie"){
        println("It's a tie!")
    }else {
        println("$winner won.")
    }

}