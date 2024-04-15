package com.coderscampus;

import java.util.Scanner;
import java.util.Random;

public class Assignment2Application {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int randomNumber = random.nextInt(100) + 1;
		int numOfGuesses = 5;
		System.out.println("The randomly generated number is: " + randomNumber);
		System.out.println("Pick a number between 1 and 100");

		while (numOfGuesses > 0) {
			int userGuess = scanner.nextInt();
			if (userGuess < 1 || userGuess > 100) {
				System.out.println("Your guess is not between 1 and 100, please try again");
				continue;
			}
			numOfGuesses--;
			if (userGuess == randomNumber) {
				System.out.println("You win!");
				break;
			} else if (numOfGuesses == 0) {
				System.out.println("You lose, the number to guess was " + randomNumber);
				break;
			} else if (userGuess < randomNumber) {
				System.out.println("Please pick a higher number");
			} else if (userGuess > randomNumber) {
				System.out.println("Please pick a lower number");
			}
		}
		scanner.close();
	}
}
