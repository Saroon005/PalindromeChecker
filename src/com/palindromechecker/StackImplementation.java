package com.palindromechecker;

import java.util.Stack;

public class StackImplementation implements PalindromeStrategy {

    @Override
    public boolean isPalindrome(String input) {

        input = input.toLowerCase();

        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        for (char c : input.toCharArray()) {
            if (!stack.pop().equals(c)) {
                return false;
            }
        }

        return true;
    }
}