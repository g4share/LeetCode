package com.g4share.lib.leetcode.dayli;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static com.google.common.truth.Truth.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class MajorityElementIITest {

    private MajorityElementII majorityElementII = new MajorityElementII();

    @ParameterizedTest
    @MethodSource("params")
    void majorityElement(int[] nums, int[] expected) {
        assertThat(majorityElementII.majorityElement(nums).stream().mapToInt(i -> i).toArray())
                .isEqualTo(expected);
    }

    private static Stream<Arguments> params() {
        return Stream.of(
                arguments(new int[] { 3, 2, 3 }, new int[] { 3 }),
                arguments(new int[] { 1 }, new int[] { 1 }),
                arguments(new int[] { 1, 2 }, new int[] { 1, 2 }),

                arguments(new int[] {  }, new int[] {  }),
                arguments(new int[] { 1, 2, 3, 4, 5, 6, 7, 8 , 9 }, new int[] {  }),
                arguments(new int[] { 3, 3, 3 }, new int[] { 3 })
        );
    }
}
