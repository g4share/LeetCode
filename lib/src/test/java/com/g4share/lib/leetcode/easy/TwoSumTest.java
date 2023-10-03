package com.g4share.lib.leetcode.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static com.google.common.truth.Truth.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class TwoSumTest {

    private TwoSum twoSum = new TwoSum();

    @ParameterizedTest
    @MethodSource("params")
    void twoSum(int[] nums, int target, int[] expected) {
        assertThat(twoSum.twoSum(nums, target))
                .isEqualTo(expected);
    }

    private static Stream<Arguments> params() {
        return Stream.of(
                arguments(new int[] { 2, 7, 11, 15 }, 9, new int[] { 0, 1 }),
                arguments(new int[] { 3, 2, 4 }, 6, new int[] { 1, 2 }),
                arguments(new int[] { 3, 3 }, 6, new int[] { 0, 1 })
        );
    }
}
