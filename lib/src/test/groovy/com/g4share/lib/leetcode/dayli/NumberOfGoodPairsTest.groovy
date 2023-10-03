package com.g4share.lib.leetcode.dayli

import spock.lang.Specification

class NumberOfGoodPairsTest extends Specification {
    def "Test 1512. Number of Good Pairs"() {
        given: 'NumberOfGoodPairs object'
            def numberOfGoodPairs = new NumberOfGoodPairs()

        when: 'I search for Number Of Good Pairs'
            def result = numberOfGoodPairs.numberOfGoodPais(nums as int[])

        then: 'Only expected number are returned'
            result == expected

        where:
            nums                            |  expected
            [1, 2, 3, 1, 1, 3]              |  4
            [1, 1, 1, 1]                    |  6
            [1, 2, 3]                       |  0
    }
}