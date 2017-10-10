package com.ctci.trees;

import java.util.ArrayList;

public class BSTRangeSearch {
  public ArrayList<Integer> rangeList = new ArrayList<Integer>();

  public void printRange(TreeNode root, int a, int b) {
    if (root == null) {
      return;
    }
    printRange(root.left, a, b);
    if (a <= root.data && b >= root.data) {
      rangeList.add(root.data);
    }
    printRange(root.right, a, b);
  }

  class OptBST {
    public void printRange(TreeNode root, int a, int b) {
      if (root == null) return;
      if (root.data >= a) {
        printRange(root.left, a, b);
      }
      if (root.data >= a && root.data <= b) {
        rangeList.add(root.data);
      }
      if (root.data <= b) {
        printRange(root.right, a, b);
      }
    }
  }
}
