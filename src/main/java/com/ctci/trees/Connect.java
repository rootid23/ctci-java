package com.ctci.trees;

public class Connect {
  public static void connect(TreeLinkNode root) {
    TreeLinkNode dummy = new TreeLinkNode(0);
    TreeLinkNode pre = dummy;
    while (root != null) {
      if (root.left != null) {
        pre.next = root.left;  // Magic : dummy.next and pre.next gets updated.
        pre = pre.next;        // overwrites pre with pre.next and no change in
                         // dummy.next
      }
      if (root.right != null) {
        pre.next = root.right;
        pre = pre.next;
      }
      root = root.next;
      if (root == null) {
        System.out.println(dummy.val);
        pre = dummy;
        root = dummy.next;
        dummy.next = null;
      }
    }
  }
}
