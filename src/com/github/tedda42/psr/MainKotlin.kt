package com.github.tedda42.psr

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) {
    println("Do you choose rock, paper or scissors?")
    val br = BufferedReader(InputStreamReader(System.`in`))
    val userChoice = br.readLine()
    val computerChoiceRand = Math.random()
    val computerChoice: String

    if (computerChoiceRand < 0.34) {
        computerChoice = "rock"
    } else if (computerChoiceRand <= 0.67) {
        computerChoice = "paper"
    } else {
        computerChoice = "scissors"
    }

    println("User    : " + userChoice)
    println("Computer: " + computerChoice)

    val result = compare(userChoice, computerChoice)
    println(result)
}

internal fun compare(choice1: String, choice2: String): String {
    if (choice1 == choice2) {
        return "The result is a tie!"
    } else if (choice1 == "rock") {
        if (choice2 == "scissors") {
            return "rock wins!"
        } else {
            return "paper wins!"
        }
    } else if (choice1 == "paper") {
        if (choice2 == "rock") {
            return "paper wins!"
        } else {
            return "scissors wins!"
        }
    } else if (choice1 == "scissors") {
        if (choice2 == "rock") {
            return "rock wins!"
        } else {
            return "scissors wins!"
        }
    } else {
        return "Invalid choice '$choice1'"
    }
}
