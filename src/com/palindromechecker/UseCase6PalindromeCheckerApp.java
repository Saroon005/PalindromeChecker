package com.palindromechecker;

/**
 * ================================================
 * MAIN CLASS - UseCase6PalindromeCheckerApp
 * ================================================
 * 
 * Use Case 6: Queue + Stack Fairness Check
 * 
 * Description:
 * This class demonstrates palindrome validation using 
 * two different data structures:
 * 
 * - Queue (FIFO - First In First Out)
 * - Stack (LIFO - Last In First Out)
 * 
 * Characters are inserted into both structures and then 
 * compared by removing from the front of the queue and 
 * the top of the stack.
 * 
 * If all characters match, the input string is confirmed
 * as a palindrome.
 * 
 * This use case helps understand how FIFO and LIFO 
 * behaviors can be combined for symmetric comparison.
 * 
 * @author Developer
 * @version 6.0
 */
import java.util.*;

public class UseCase6PalindromeCheckerApp {
	/**
	 * Application entry point for UC6.
	 * 
	 * @param args Command-line arguments.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("==================================================");
		System.out.println("Welcome to Palindrome Checker Management System");
		System.out.println("Version : 6.0");
		System.out.println("System initialized succesfully.");
		System.out.println("==================================================");
		System.out.print("Enter the Input : ");
		String input = sc.nextLine();
		input = input.toLowerCase();
		
		Queue<Character> queue = new LinkedList<>();
		
		Stack<Character> stack = new Stack<>();
		
		for (char c : input.toCharArray()) {
			queue.add(c);
			stack.push(c);
		}
		
		boolean isPalindrome = true;
		
		while (!queue.isEmpty()) {
			if (queue.poll().equals(stack.pop())) {
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
