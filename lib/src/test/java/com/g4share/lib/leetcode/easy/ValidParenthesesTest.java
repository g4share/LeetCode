package com.g4share.lib.leetcode.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static com.google.common.truth.Truth.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class ValidParenthesesTest {

    private final ValidParentheses validParentheses = new ValidParentheses();

    @ParameterizedTest
    @MethodSource("params")
    void validParentheses(String s, boolean expected) {
        assertThat(validParentheses.check(s))
                .isEqualTo(expected);
    }

    private static Stream<Arguments> params() {
        return Stream.of(
                arguments("()", true),
                arguments("()[]{}", true),
                arguments("(]", false),
                arguments("]", false),
                arguments("[", false),
                arguments("aaa(bb)[c]{}d", true),
                arguments("aaa(bb)[c(]{}d", false)
        );
    }
}
