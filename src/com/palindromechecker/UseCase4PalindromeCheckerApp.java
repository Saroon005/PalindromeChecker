package com.palindromechecker;

/**
 * ======================================================
 * MAIN CLASS - UseCase4PalindromeCheckerApp
 * ======================================================
 * 
 * Use Case 4: Character Array Based Validation
 * 
 * Description:
 * This class validates a palindrome by converting
 * the string into a character array and comparing
 * characters using the two-pointer technique.
 * 
 * At this stage, the application:
 * - Converts string to char array
 * - Uses start and end pointers
 * - Compares characters efficiently
 * - Displays the result
 * 
 * This reduces extra memory usage.
 * 
 * @author Developer
 * @version 4.0
 */
import java.util.Scanner;
public class UseCase4PalindromeCheckerApp {
	/**
	 * Application entry point for UC4.
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
		
		char[] chars = input.toCharArray();
		
		int start = 0;
		
		int end = chars.length - 1;
		
		boolean isPalindrome = true;
		
		while (start < end) {
			if (chars[start++]==chars[end--]) {
				isPalindrome = true;
			} else {
				isPalindrome = false;
			}
		}
		System.out.println("Is Palindrome? : " + isPalindrome);
		sc.close();
	}
}
