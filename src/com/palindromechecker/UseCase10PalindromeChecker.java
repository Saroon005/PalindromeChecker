package com.palindromechecker;

/**
 * =================================================
 * MAIN CLASS - UseCase10PalindromeCheckerApp
 * =================================================
 * 
 * Use Case 10: Normalized Palindrome validation
 * 
 * Description:
 * This class validates a palindrome after preprocessing
 * the input string.
 * 
 * Normalization includes:
 * - Removing spaces and symbols.
 * - Converting to lowercase
 * 
 * This ensures the palindrome check is logical rather
 * than character-format dependent.
 * 
 * Example:
 * "A man a plan a canal Panama"
 * @author Developer
 * @version 10.0
 */

import java.util.*;
public class UseCase10PalindromeChecker {

	/**
	 * Application entry point for UC10.
	 * 
	 * @param args Command-line arguments
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("==================================================");
		System.out.println("Welcome to Palindrome Checker Management System");
		System.out.println("Version : 10.0");
		System.out.println("System initialized succesfully.");
		System.out.println("==================================================");
		System.out.print("Enter the Input : ");
		String input = sc.nextLine();
		boolean isPalindrome = true;
		String normalized = input.replaceAll("\\s+", "").toLowerCase();
		//Compare characters from both ends
		for (int i = 0; i < normalized.length() / 2; i++) {
			//Compare symmetric characters
			if (normalized.charAt(i) != normalized.charAt(normalized.length() - 1 - i)) {
				isPalindrome = false;
				break;
			} else {
				isPalindrome = true;
			}
		}
		System.out.println("Input : " + input + "\nIs Palindrome? : " + isPalindrome);
		sc.close();
	}
}
