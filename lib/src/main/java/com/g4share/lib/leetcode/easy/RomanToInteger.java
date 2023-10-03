//Copyright (c) 2023 g4share

/*
    https://leetcode.com/problems/roman-to-integer
    13. Roman to Integer
 */
package com.g4share.lib.leetcode.easy;

public class RomanToInteger {
    private final char[] romans = {'M', 'D', 'C', 'L', 'X', 'V', 'I'};
    private final int[] dec = {1000, 500, 100, 50, 10, 5, 1};

    public int romanToInt(String s) {
        int number = 0;
        int pSum = 0;
        for (int i = 0; i < s.length(); i++) {
            int pi = romanPos(s.charAt(i));
            int pn = i == s.length() - 1
                    ? pi + 1
                    : romanPos(s.charAt(i+1));

            pSum += dec[pi];

            if (pi == pn) {
                continue;
            }

            if (pi < pn) {
                number += pSum;
            } else {
                number -= pSum;
            }
            pSum = 0;
        }
        return number;
    }

    private int romanPos(char r) {
        for (int i = 0; i < romans.length; i++) {
            if (romans[i] == r) {
                return i;
            }
        }
        return -1;
    }
}