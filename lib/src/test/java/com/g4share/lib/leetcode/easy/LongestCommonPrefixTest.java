package com.g4share.lib.leetcode.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static com.google.common.truth.Truth.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class LongestCommonPrefixTest {

    private LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();

    @ParameterizedTest
    @MethodSource("params")
    void longestCommonPrefix(String[] input, String expected) {
        assertThat(longestCommonPrefix.longestCommonPrefix(input))
                .isEqualTo(expected);
    }

    private static Stream<Arguments> params() {
        return Stream.of(
                arguments(new String[] { "flower","flow","flight" }, "fl"),
                arguments(new String[] { "dog","racecar","car" }, "")
        );
    }
}
