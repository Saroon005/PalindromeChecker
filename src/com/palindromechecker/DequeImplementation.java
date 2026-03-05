package com.palindromechecker;

import java.util.*;

public class DequeImplementation implements PalindromeStrategy {

    @Override
    public boolean isPalindrome(String input) {

        input = input.toLowerCase();

        Deque<Character> deque = new ArrayDeque<>();

        for (char c : input.toCharArray()) {
            deque.add(c);
        }

        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }

        return true;
    }
}