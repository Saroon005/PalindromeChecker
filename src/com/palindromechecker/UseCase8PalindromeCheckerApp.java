package com.palindromechecker;

/**
 * =================================================
 * MAIN CLASS - UseCase8PalindromeCheckerApp
 * =================================================
 * 
 * Use Case 8: Linked List Based Palindrome Checker
 * 
 * Description:
 * This class checks whether a string is a palindrome
 * using a LinkedList.
 * 
 * Characters are added to the list and then compared
 * by removing elements from both ends:
 * 
 * - removeFirst()
 * - removeLast()
 * 
 * This demonstrates how LinkedList supports
 * double-ended operations for symmetric validation.
 * 
 * @author Developer
 * @version 8.0
 */

import java.util.*;
public class UseCase8PalindromeCheckerApp {
	/**
	 * Application entry point for UC8.
	 * 
	 * @param args Command-line arguments
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("==================================================");
		System.out.println("Welcome to Palindrome Checker Management System");
		System.out.println("Version : 8.0");
		System.out.println("System initialized succesfully.");
		System.out.println("==================================================");
		System.out.print("Enter the Input : ");
		String input = sc.nextLine();
		input = input.toLowerCase();
		
		LinkedList<Character> list = new LinkedList<>();
		
		for (char c : input.toCharArray()) {
			list.add(c);
		}
		
		boolean isPalindrome = true;
		
		while (list.size() > 1) {
			if (list.removeFirst().equals(list.removeLast())) {
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
