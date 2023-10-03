package com.g4share.lib.leetcode.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static com.google.common.truth.Truth.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class RomanToIntegerTest {

    private RomanToInteger romanToInteger = new RomanToInteger();

    @ParameterizedTest
    @MethodSource("params")
    void romanToInteger(String roman, int decimal) {
        assertThat(romanToInteger.romanToInt(roman))
                .isEqualTo(decimal);
    }

    private static Stream<Arguments> params() {
        return Stream.of(
                arguments("III", 3),
                arguments("LVIII", 58),
                arguments("MCMXCIV", 1994)
        );
    }
}
