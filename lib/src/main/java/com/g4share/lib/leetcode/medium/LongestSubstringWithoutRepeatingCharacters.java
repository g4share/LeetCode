//Copyright (c) 2023 g4share

/*
    https://leetcode.com/problems/longest-substring-without-repeating-characters
    3. Longest Substring Without Repeating Characters
 */
package com.g4share.lib.leetcode.medium;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        String longest = "";
        for (int i = 0; i < s.length(); i++) {
            String temp = check(s.substring(i));
            if (temp.length() > longest.length()) {
                longest = temp;
            }
        }
        return longest.length();
    }

    private String check(String s) {
        final StringBuilder temp = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            String ch = s.substring(i, i + 1);
            if (temp.indexOf(ch) >= 0) {
                break;
            }
            temp.append(ch);
        }
        return temp.toString();
    }
}
