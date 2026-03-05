package com.palindromechecker;

/**
 * ==================================================
 * MAIN CLASS - UseCase11PalindromeCheckerApp
 * ==================================================
 * 
 * Use Case 11: Object-Oriented Palindrome Service
 * 
 * Description:
 * This class demonstrates palindrome validation using 
 * object-oriented design.
 * 
 * The class demonstrates palindrome validation using 
 * object-oriented design.
 * 
 * The palindrome logic is encapsulated inside a 
 * PalindromeService class.
 * 
 * This improves:
 * - Reusability
 * - Readability
 * - Separation of concerns
 * 
 * @author Developer
 * @version 11.0
 */

import java.util.*;
public class UseCase11PalindromeCheckerApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("==================================================");
		System.out.println("Welcome to Palindrome Checker Management System");
		System.out.println("Version : 11.0");
		System.out.println("System initialized succesfully.");
		System.out.println("==================================================");
		System.out.print("Enter the Input : ");
		String input = sc.nextLine();
		boolean isPalindrome = PalindromeService.checkPalindrome(input);
		
		System.out.println("Input : " + input + "\nIs Palindrome? : " + isPalindrome);
		sc.close();
	}
}
