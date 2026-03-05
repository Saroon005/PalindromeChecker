package com.palindromechecker;
/**
 * Service class that contains palindrome logic.
 */
public class PalindromeService {
	/**
	 * Checks whether the input string is a palindrome.
	 * 
	 * @param input Input string
	 * @return true if palindrome, false otherwise
	 */
	public static boolean checkPalindrome(String input) {
		boolean isPalindrome=true;
		String normalized = input.replaceAll("\\s+", "").toLowerCase();
		//Compare characters from both ends
		for (int i = 0; i < normalized.length() / 2; i++) {
			//Compare symmetric characters
			if (normalized.charAt(i) != normalized.charAt(normalized.length() - 1 - i)) {
				isPalindrome = false;
				return isPalindrome;
			} else {
				isPalindrome = true;
			}
		}
		return isPalindrome;
	}
}
