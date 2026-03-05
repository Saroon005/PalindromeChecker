package com.palindromechecker;
/**
 * =================================================
 * MAIN CLASS - UseCase13PalindromeCheckerApp
 * =================================================
 *
 * Use Case 13: Performance Comparison
 *
 * Description:
 * This class measures and compares the execution
 * performance of palindrome validation algorithms.
 *
 * At this stage, the application:
 * - Uses a palindrome strategy implementation
 * - Captures execution start and end time
 * - Calculates total execution duration
 * - Displays benchmarking results
 *
 * This use case focuses purely on performance
 * measurement and algorithm comparison.
 *
 * The goal is to introduce benchmarking concepts.
 *
 * @author Developer
 * @version 13.0
 */

import java.util.*;
public class UseCase13PalindromeCheckerApp {

    /**
     * Application entry point for UC13.
     *
     * @param args Command-line arguments
     */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.println("==================================================");
        System.out.println("Welcome to Palindrome Checker Management System");
        System.out.println("Version : 13.0");
        System.out.println("System initialized successfully.");
        System.out.println("==================================================");

        System.out.print("Enter the Input : ");
        String input = sc.nextLine();
        String normalizedInput = input.replaceAll("\\s+", "").toLowerCase();
        // Strategy 1 : Stack
        PalindromeStrategy stackStrategy = new StackImplementation();

        long startTime1 = System.nanoTime();
        boolean stackResult = stackStrategy.isPalindrome(normalizedInput);
        long endTime1 = System.nanoTime();

        long stackExecutionTime = endTime1 - startTime1;

        System.out.println("\n--- Stack Strategy ---");
        System.out.println("Is Palindrome? " + stackResult);
        System.out.println("Execution Time: " + stackExecutionTime + " ns");


        // Strategy 2 : Deque
        PalindromeStrategy dequeStrategy = new DequeImplementation();

        long startTime2 = System.nanoTime();
        boolean dequeResult = dequeStrategy.isPalindrome(normalizedInput);
        long endTime2 = System.nanoTime();

        long dequeExecutionTime = endTime2 - startTime2;

        System.out.println("\n--- Deque Strategy ---");
        System.out.println("Is Palindrome? " + dequeResult);
        System.out.println("Execution Time: " + dequeExecutionTime + " ns");
	}
}
