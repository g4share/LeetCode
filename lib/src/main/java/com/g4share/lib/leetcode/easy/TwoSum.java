//Copyright (c) 2023 g4share

/*
    https://leetcode.com/problems/two-sum
    1. Two Sum
 */
package com.g4share.lib.leetcode.easy;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            int k = checkAtIndex(i, nums, target);
            if ( k != -1) {
                return new int[] {i, k};
            }
        }
        return new int[0];
    }

    private int checkAtIndex(int i, int[] nums, int target) {
        int s = target - nums[i];
        for (int k = i + 1; k < nums.length; k++) {
            if (nums[k] == s) {
                return k;
            }
        }

        return -1;
    }
}
