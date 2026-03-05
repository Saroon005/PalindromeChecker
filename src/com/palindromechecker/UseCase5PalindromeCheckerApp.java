package com.palindromechecker;

/**
 * ===============================================
 * MAIN CLASS - UseCase5PalindromeCheckerApp
 * ===============================================
 * 
 * Use Case 5: Stack based Palindrome Checker
 * 
 * Description:
 * This class validates a palindrome using a Stack
 * data structure which follows the LIFO principle.
 * 
 * At this stage, the application:
 * - Pushes characters into a stack
 * - Pops them in reverse order
 * - Compares with original sequence
 * - Display the result
 * 
 * This maps stack behavior to reversal logic.
 * 
 * @author Developer
 * @version 5.0
 */

import java.util.*;
public class UseCase5PalindromeCheckerApp {
	/**
	 * Application entry point for UC5.
	 * 
	 * @param args Command-line arguments
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("==================================================");
		System.out.println("Welcome to Palindrome Checker Management System");
		System.out.println("Version : 5.0");
		System.out.println("System initialized succesfully.");
		System.out.println("==================================================");
		System.out.print("Enter the Input : ");
		String input = sc.nextLine();
		input = input.toLowerCase();
		
		Stack<Character> stack = new Stack<>();
		
		for (char c : input.toCharArray()) {
			stack.push(c);
		}
		
		boolean isPalindrome = true;
		
		for (char c : input.toCharArray()) {
			if (stack.pop().equals(c)) {
				isPalindrome = true;
			} else {
				isPalindrome = false;
				break;
			}
		}
		
		System.out.println("Input : " + input + "\nIs Palindrome? : " + isPalindrome);
		sc.close();
	}
}
