package com.g4share.lib.leetcode.medium;

import com.g4share.common.ListNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static com.google.common.truth.Truth.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class AddTwoNumbersTest {

    private final AddTwoNumbers addTwoNumbers = new AddTwoNumbers();

    @ParameterizedTest
    @MethodSource("params")
    void addTwoNumbers(int[] l1, int[] l2, int[] expected) {
        assertThat(addTwoNumbers.addTwoNumbers(toListNode(l1), toListNode(l2)))
                .isEqualTo(toListNode(expected));
    }

    private ListNode toListNode(int[] l) {
        ListNode node = new ListNode(l[l.length - 1]);
        for (int i = l.length - 2; i >= 0; i--) {
            node = new ListNode(l[i], node);
        }
        return node;
    }

    private static Stream<Arguments> params() {
        return Stream.of(
                //arguments(new int[] { 2, 4, 3 },  new int[] { 5, 6, 4 },  new int[] { 7, 0, 8 }),
                //arguments(new int[] { 0 },  new int[] { 0 },  new int[] { 0 }),
                arguments(new int[] { 9, 9, 9, 9, 9, 9 , 9 },
                        new int[] { 9, 9, 9, 9 },  new int[] { 8, 9, 9, 9, 0, 0, 0, 1 })
        );
    }
}
