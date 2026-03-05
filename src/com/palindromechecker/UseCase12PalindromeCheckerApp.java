package com.palindromechecker;
/**
 * =================================================
 * MAIN CLASS - UseCase12PalindromeCheckerApp
 * =================================================
 *
 * Use Case 12: Strategy Pattern for Palindrome Algorithms
 *
 * Description:
 * This class demonstrates how different palindrome
 * validation algorithms can be selected dynamically
 * at runtime using the Strategy Design Pattern.
 *
 * At this stage, the application:
 * - Defines a common PalindromeStrategy interface
 * - Implements a concrete Stack based strategy
 * - Injects the strategy at runtime
 * - Executes the selected algorithm
 *
 * No performance comparison is done in this use case.
 * The focus is purely on algorithm interchangeability.
 *
 * The goal is to teach extensible algorithm design.
 *
 * @author Developer
 * @version 12.0
 */
import java.util.*;
public class UseCase12PalindromeCheckerApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.println("==================================================");
        System.out.println("Welcome to Palindrome Checker Management System");
        System.out.println("Version : 12.0");
        System.out.println("System initialized successfully.");
        System.out.println("==================================================");

        System.out.print("Enter the Input : ");
        String input = sc.nextLine();

        System.out.println("Choose the strategy for checking Palindrome:");
        System.out.println("1. Stack Based");
        System.out.println("2. Deque Based");

        int choice = sc.nextInt();

        PalindromeStrategy strategy = null;

        switch (choice) {
            case 1:
                strategy = new StackImplementation();
                break;

            case 2:
                strategy = new DequeImplementation();
                break;

            default:
                System.out.println("Wrong Choice!!!");
                sc.close();
                return;
        }

        boolean isPalindrome = strategy.isPalindrome(input);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);

        sc.close();
	}
}
