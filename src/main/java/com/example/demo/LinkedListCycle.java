package com.example.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class LinkedListCycle {
    public static void main(String[] args) {
        System.out.println(hasCycle(new ListNode(3, new ListNode(2,new ListNode(0,new ListNode(-4, null))))));
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x, ListNode next1) {
            val = x;
            next = next1;
        }
    }

    public static boolean hasCycle(ListNode head) {
        ListNode current = head;
        while (head.next != null) {
            head = head.next;
            if (current == head){
                return true;
            }
        }
        return false;
    }
}
