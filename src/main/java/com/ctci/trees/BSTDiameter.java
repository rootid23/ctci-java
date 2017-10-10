package com.ctci.trees;

public class BSTDiameter {
  // For every node, length of longest path which pass it = MaxDepth of its left
  // subtree + MaxDepth of its right subtree.

  int max = 0;

  public int diameter(TreeNode root) {
    maxDepth(root);
    return max;
  }

  private int maxDepth(TreeNode root) {
    if (root == null) return 0;
    int left = maxDepth(root.left);
    int right = maxDepth(root.right);
    max = Math.max(max, left + right + 1);
    return Math.max(left, right) + 1;
  }

  public int DiameterOfBinaryTree(TreeNode root) { return DFS(root)[0]; }

  // int[2] = [best, height]
  private int[] DFS(TreeNode node) {
    if (node == null) return new int[] {0, 0};
    int[] left = DFS(node.left);
    int[] right = DFS(node.right);

    int best = Math.max(left[1] + right[1], Math.max(left[0], right[0]));
    int height = 1 + Math.max(left[1], right[1]);
    return new int[] {best, height};
  }
}
