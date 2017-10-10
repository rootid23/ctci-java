package com.ctci.linklist;
// Implement an algorithm to find the nth to last element of a singly linked
// list.

public class L2_2 {
  public static ListNode getNthToLastNode(ListNode head, int n) {
    if (head == null) return head;
    ListNode current = head;
    ListNode second = head;
    while (n-- > 0 && current.next != null) {
      current = current.next;
    }
    if (n > 0) return null;
    while (current != null && current.next != null) {
      second = second.next;
      current = current.next;
    }
    return second;
  }
}
