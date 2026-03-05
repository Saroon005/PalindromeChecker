package com.palindromechecker;

/**
 * ===================================================
 * MAIN CLASS - UseCase7PalindromeCheckerApp
 * ===================================================
 * 
 * Use Case 7: Deque Based Optimized Palindrome Checker
 * 
 * Description:
 * This class validates a palindrome using a Deque
 * (Double Ended Queue).
 * 
 * Characters are inserted into the deque and then
 * compared by removing elements from both ends:
 * 
 * - removeFirst()
 * - removeLast()
 * 
 * This avoids reversing the string and provides an
 * efficient front-to-back comparison approach.
 * 
 * This use case demonstrates optimal bidirectional
 * traversal using Deque.
 * 
 * @author Developer
 * @version 7.0
 */

import java.util.*;
public class UseCase7PalindromeCheckerApp {
	/**
	 * Application entry point for UC7.
	 * 
	 * @param args Command-line arguments
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("==================================================");
		System.out.println("Welcome to Palindrome Checker Management System");
		System.out.println("Version : 7.0");
		System.out.println("System initialized succesfully.");
		System.out.println("==================================================");
		System.out.print("Enter the Input : ");
		String input = sc.nextLine();
		input = input.toLowerCase();
		
		Deque<Character> deque = new ArrayDeque<>();
		
		for (char c : input.toCharArray()) {
			deque.add(c);
		}
		
		boolean isPalindrome = true;
		
		while (deque.size() > 1) {
			if (deque.removeFirst().equals(deque.removeLast())) {
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
