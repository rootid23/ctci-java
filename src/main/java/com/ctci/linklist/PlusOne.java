package com.ctci.linklist;

public class PlusOne {
  public static ListNode plusOne(ListNode head) {
    if (1 == plusOneHelper(head)) {
      ListNode newNode = new ListNode(1);
      newNode.next = head;
      return newNode;
    }
    return head;
  }

  private static int plusOneHelper(ListNode head) {
    if (head == null) return 1;
    int carry = 1;
    carry = plusOneHelper(head.next);
    if (head.val < 9) {
      head.val += carry;
      return 0;
    }
    head.val = 0;
    return 1;
  }
}
