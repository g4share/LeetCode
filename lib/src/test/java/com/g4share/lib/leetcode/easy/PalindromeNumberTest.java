package com.g4share.lib.leetcode.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static com.google.common.truth.Truth.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class PalindromeNumberTest {

    private PalindromeNumber palindromeNumber = new PalindromeNumber();

    @ParameterizedTest
    @MethodSource("params")
    void palindromeNumber(int x, boolean isPalindrome) {
        assertThat(palindromeNumber.isPalindrome(x))
                .isEqualTo(isPalindrome);
    }

    private static Stream<Arguments> params() {
        return Stream.of(
                arguments(121, true),
                arguments(-121, false),
                arguments(10, false)
        );
    }
}
