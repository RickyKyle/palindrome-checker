package palindrome;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		// Create a new scanner class to capture user input.
		Scanner scanner = new Scanner(System.in);
		// Create and initialise a String  variable to store user input. 
		String anotherRound = " ";

		// Call pallindromeChecker method while the user's input is not 'n'.
		do {
			pallindromeChecker();
			System.out.println("Do you want to check another word? Y/N: ");
			anotherRound = scanner.next();

		} while (!anotherRound.equalsIgnoreCase("n"));

		scanner.close();

	}
	
	/**
	 * Method captures user's input, reverses it, and checks if the reversed
	 * input matches the initial input, making the word a palindrome. 
	 */

	public static void pallindromeChecker() {

		Scanner scanner = new Scanner(System.in);
		String userInput = "";

		System.out.println("Enter a word to check to see if it's a pallindrome:");
		userInput = scanner.nextLine();

		// Array to hold and convert user's input to a char array.
		char[] userInputCharArray = userInput.toCharArray();
		
		// Char array to hold the reversed user's input.
		char[] userInputReversedArray = new char[userInput.length()];

		// Variable to increment to iterate from the start to the end of the
		// the reversed array.
		int reversedArrayPosition = 0;

		// For loop iterates from the end of the user input array to the start.
		for (int arrayPosition = userInput.length() - 1; arrayPosition >= 0; arrayPosition--) {
			// Stores each char (from end to beginning) from the input array into the reversed
			// array (from beginning to end) to reverse the initial input.
			userInputReversedArray[reversedArrayPosition] = userInputCharArray[arrayPosition];
			reversedArrayPosition++;

		}

		// Turns reversed array into a String.
		String userInputReversed = new String(userInputReversedArray);

		// Compares reversed input to initial input.
		if (userInputReversed.equalsIgnoreCase(userInput)) {
			System.out.println("Yep, it's a palindrome!");
		} else {
			System.out.println("Nope, not a palindrome!");
		}

	}

}
