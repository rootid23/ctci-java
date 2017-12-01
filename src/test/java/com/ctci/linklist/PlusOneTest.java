package com.ctci.linklist;

import org.junit.Assert;
import org.junit.Test;


public class PlusOneTest {

  @Test
  public void testPlusOne() {
    ListNode node = createNodeList(new int[] {9,9});
    ListNode result = PlusOne.plusOne(node);
    traverseList(result , 3, new int[]{1,0,0});

    node = createNodeList(new int[] {1,2,1});
    result = PlusOne.plusOne(node);
    traverseList(result , 3, new int[]{1,2,2});

    node = createNodeList(new int[] {1,9});
    result = PlusOne.plusOne(node);
    traverseList(result , 2, new int[]{2,0});
  }

  private ListNode createNodeList(int[] values) {
    ListNode head = new ListNode(-1);
    ListNode tmp = head;
    for(int v : values) {
      tmp.next = new ListNode(v);
      tmp = tmp.next;
    }
    return head.next;
  }
  private void traverseList(ListNode head, int expCount, int[] expectedVal) {
    int count = 0;
    while(head != null) {
      Assert.assertEquals(head.val, expectedVal[count++]);
      head = head.next;
    }
    Assert.assertEquals(expCount, count);
  }
}
