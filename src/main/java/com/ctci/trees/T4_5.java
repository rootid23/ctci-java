package com.ctci.trees;

// BST Validation
// Given the root node of a Binary Tree, determine if it is a Binary Search
// Tree.
// Examples:
//          20
//        /   \
//      15    30
//     /  \
//    14  18
//    output ==> true
//
//          20
//         /   \
//       30    15
//      /  \
//     14  18
//
//   output ==> false
public class T4_5 {
  public boolean validateBST(TreeNode root) {
    return isValidBST(root, null, null);
  }

  private boolean isValidBST(TreeNode root, TreeNode min, TreeNode max) {
    if (root == null) return true;
    if ((min == null || root.data > min.data) &&
        (max == null || root.data < max.data)) {
      return isValidBST(root.left, min, root) &&
          isValidBST(root.right, root, max);
    }
    return false;
  }
}
