package com.palindromechecker;

/**
 * =====================================================
 * MAIN CLASS - UseCase2PalindromeCheckerApp
 * =====================================================
 * 
 * Use Case 2: Hardcoded palindrome validation
 * 
 * Description:
 * This class demonstrates basic palindrome validation
 * using a hardcoded string value.
 * 
 * At this stage, the application:
 * - Stores a predefined string
 * - Compares characters from both ends
 * - Determines whether the string is a palindrome
 * - Displays the result on the console
 * 
 * This use case introduces fundamental comparison logic
 * before using advanced data structures.
 * 
 * @author Developer
 * @version 2.0
 */
public class UseCase2PalindromeCheckerApp {
	/**
	 * Application entry point for UC2.
	 * 
	 * @param args Command-line arguments
	 */
	public static void main(String[] args) {
		String text = "madam";
		Boolean result = false;
		for (int i = 0; i < text.length()/2; i++) {
			if(text.charAt(i)==text.charAt(text.length()-i-1)) {
				result = true;
			} else {
				result = false;
				break;
			}
		}
		System.out.println("Input text: " + text);
		System.out.println("Is it a Palindrome? : " + result);
	}
}
