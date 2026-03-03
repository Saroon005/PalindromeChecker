package com.palindromechecker;

/**
 * ========================================================
 * MAIN CLASS - UseCase3PalindromeCheckerApp
 * ========================================================
 * 
 * Use Case 3: Reverse String Based Palindrome Check
 * 
 * Description:
 * This class checks whether a string is a palindrome 
 * by reversing the string and comparing it with
 * the original value.
 * 
 * At this stage, the application:
 * - Iterates the string in reverse order
 * - Builds a reversed version
 * - Compares original and reversed strings
 * - Displays the validation result
 * 
 * This introduces transformation-based validation.
 * 
 * @author Developer
 * @version 3.0
 */

import java.util.Scanner;

public class UseCase3PalindromeCheckerApp {
	/**
	 * Application entry point for UC3.
	 * 
	 * @param args Command-line arguments
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("==================================================");
		System.out.println("Welcome to Palindrome Checker Management System");
		System.out.println("Version : 3.0");
		System.out.println("System initialized succesfully.");
		System.out.println("==================================================");
		System.out.print("Enter the Input : ");
		String input = sc.nextLine();
		System.out.println();
		StringBuilder reversedInput = new StringBuilder();
		for (int i = input.length() - 1; i >= 0; i--) {
			reversedInput.append(input.charAt(i));
		}
		
		System.out.println("Original : " + input);
		System.out.println("Reversed : " + reversedInput);
	
		if (input.equals(reversedInput.toString())) {
			System.out.println("Is Palindrome? : true");
		} else {
			System.out.println("Is Palindrome? : false");
		}
		sc.close();
	}
}
