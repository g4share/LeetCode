//Copyright (c) 2023 g4share

/*
    https://leetcode.com/problems/palindrome-number
    9. Palindrome Number
 */
package com.g4share.lib.leetcode.easy;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        String tNum = String.valueOf(x);
        int l = tNum.length();
        int p = l >> 1;

        for (int i = 0; i < p; i++) {
            if (tNum.charAt(i) != tNum.charAt(l - i - 1)) {
                return false;
            }
        }

        return true;
    }
}
