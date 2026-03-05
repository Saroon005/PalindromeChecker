package com.palindromechecker;

/**
 * =================================================
 * INTERFACE - PalindromeStrategy
 * =================================================
 *
 * This interface defines a contract for all
 * palindrome checking algorithms.
 *
 * Any new algorithm must implement this interface
 * and provide its own validation logic.
 */
public interface PalindromeStrategy {

    boolean isPalindrome(String input);

}