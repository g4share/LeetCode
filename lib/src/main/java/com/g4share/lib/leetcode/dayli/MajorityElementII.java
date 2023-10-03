//Copyright (c) 2023 g4share

/*
    https://leetcode.com/problems/majority-element-ii
    229. Majority Element II
 */
package com.g4share.lib.leetcode.dayli;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MajorityElementII {
    public List<Integer> majorityElement(int[] nums) {
        Arrays.sort(nums);

        int times = nums.length / 3;
        int index = 0;
        List<Integer> majorityElements = new ArrayList<>();
        while (index < nums.length) {
            index = checkElement(nums, times, index, majorityElements);
        }
        return majorityElements;
    }

    private int checkElement(int[] nums, int times, int index, List<Integer> majorityElements) {
        int element = nums[index];
        int offset = 0;
        while (index + ++offset < nums.length
                && nums[index + offset] == element);

        if (offset > times) {
            majorityElements.add(element);
        }
        return index + offset;
    }
}
