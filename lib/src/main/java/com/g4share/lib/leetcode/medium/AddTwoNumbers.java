//Copyright (c) 2023 g4share

/*
    https://leetcode.com/problems/add-two-numbers
    2. Add Two Numbers
 */
package com.g4share.lib.leetcode.medium;

import com.g4share.common.ListNode;

import java.util.ArrayList;
import java.util.List;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        List<ListNode> nodes = add(l1, l2);
        return toListNode(nodes);
    }

    private List<ListNode> add(ListNode l1, ListNode l2) {
        List<ListNode> nodes = new ArrayList<>();
        int addFromPrevious = 0;

        do {
            int v1 = l1 == null ? 0 : l1.getVal();
            int v2 = l2 == null ? 0 : l2.getVal();

            int sum = v1 + v2 + addFromPrevious;
            addFromPrevious = 0;
            if (sum >= 10) {
                sum -=10;
                addFromPrevious = 1;
            }
            nodes.add(new ListNode(sum));

            if (l1 != null) {
                l1 = l1.getNext();
            }
            if (l2 != null) {
                l2 = l2.getNext();
            }
        } while (l1 != null || l2 != null);

        if (addFromPrevious == 1) {
            nodes.add(new ListNode(1));
        }
        return nodes;
    }

    private ListNode toListNode(List<ListNode> nodes) {
        ListNode node = nodes.get(nodes.size() - 1);
        nodes.remove(nodes.size() - 1);

        for (int i = nodes.size() - 1; i >= 0; i--) {
            node = new ListNode(nodes.get(i).getVal(), node);
            nodes.remove(i);
        }
        return node;
    }
}