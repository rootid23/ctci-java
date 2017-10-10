package com.ctci.linklist;

import java.util.HashSet;
import java.util.Set;

// Write a program to remove duplicates from an unsorted linked list.
// How would you solve this problem if a temporary buffer is not allowed?
public class L2_1 {
  public static void unsortedLinkedListNode(LinkedListNode head) {
    Set<Integer> store = new HashSet<>();
    LinkedListNode current = head;
    LinkedListNode prev = null;
    while (current != null) {
      if (store.contains(current.data)) {
        prev.next = current.next;
        // current = null;
        // current = prev.next;
      } else
        store.add(current.data);
      prev = current;
      current = current.next;
    }
  }
}
