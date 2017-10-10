package com.ctci.trees;

public class DecompressTree {
  // java.util.* has been imported for this problem.
  // You don't need any other imports.

  public TreeNode decompressTree(String str) {
    if (str == null || str.length() == 0) {
      return null;
    }
    String[] strs = str.split(",");
    return helper(strs, 0, 0);
  }

  public TreeNode helper(String[] str, int idx, int level) {
    TreeNode root = null;
    if (str == null || str.length < idx) {
      return root;
    } else {
      if (str[idx].charAt(0) == '*') {
        return null;
      } else {
        root = new TreeNode(str[idx].charAt(0));
      }
    }
    if (root != null) {
      idx = (int)Math.pow(2, level);
      if (str.length > idx + 1) {
        root.left = helper(str, idx + 1, level + 1);
      }
      if (str.length > idx + 2) {
        root.right = helper(str, idx + 2, level + 1);
      }
    }
    return root;
  }
}
