//Copyright (c) 2023 g4share

/*
    https://leetcode.com/problems/valid-parentheses
    20. Valid Parentheses
 */
package com.g4share.lib.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class ValidParentheses {
    private static final String START = "({[";
    private static final String END = ")}]";

    public boolean check(String s) {
        final List<Integer> parentheses = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            int idx;
            if ((idx = getIndex(START, s.charAt(i)))!= -1) {
                parentheses.add(idx);
                continue;
            }
            if ((idx = getIndex(END, s.charAt(i)))!= -1) {
                if (parentheses.isEmpty()) {
                    return false;
                }

                if (idx != parentheses.get(parentheses.size() - 1)) {
                    return false;
                }
                parentheses.remove(parentheses.size() - 1);
            }
        }

        return parentheses.isEmpty();
    }

    private int getIndex(String parentheses, char ch) {
        return parentheses.indexOf(ch);
    }
}
