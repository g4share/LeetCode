//Copyright (c) 2023 g4share

/*
    https://leetcode.com/problems/longest-common-prefix
    14. Longest Common Prefix
 */
package com.g4share.lib.leetcode.easy;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String prefix = "";
        String first = strs[0];

        for (int i = 0; i < strs[0].length(); i++) {
            boolean checkNext = mb(prefix + first.charAt(i), strs);
            if (!checkNext) {
                return prefix;
            }

            prefix = prefix + first.charAt(i);
        }

        return prefix;
    }

    private boolean mb(String newPrefix, String[] strs) {
        for (int i = 1; i < strs.length; i++) {
            if (!strs[i].startsWith(newPrefix)) {
                return false;
            }
        }
        return true;
    }
}