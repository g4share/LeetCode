//Copyright (c) 2023 g4share

/*
    https://leetcode.com/problems/number-of-good-pairs
    1512. Number of Good Pairs
 */
package com.g4share.lib.leetcode.dayli;

public class NumberOfGoodPairs {
    public int numberOfGoodPais(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            count += numberOfGoodPais(i, nums);
        }
        return count;
    }

    private int numberOfGoodPais(int firstIdx, int[] nums) {
        int count = 0;
        for (int i = firstIdx + 1; i < nums.length; i++) {
            if (nums[firstIdx] == nums[i]) {
                count++;
            }
        }
        return count;
    }
}
