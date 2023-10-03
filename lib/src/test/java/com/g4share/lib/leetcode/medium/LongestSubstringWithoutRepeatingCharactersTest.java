package com.g4share.lib.leetcode.medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static com.google.common.truth.Truth.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class LongestSubstringWithoutRepeatingCharactersTest {

    private final LongestSubstringWithoutRepeatingCharacters longestSubstring =
            new LongestSubstringWithoutRepeatingCharacters();

    @ParameterizedTest
    @MethodSource("params")
    void validParentheses(String s, int expected) {
        assertThat(longestSubstring.lengthOfLongestSubstring(s))
                .isEqualTo(expected);
    }

    private static Stream<Arguments> params() {
        return Stream.of(
                arguments("abcabcbb", 3),
                arguments("bbbbb", 1),
                arguments("pwwkew", 3),
                arguments(" ", 1),
                arguments("", 0)
        );
    }
}
