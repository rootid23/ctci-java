package com.ctci.trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class NodeFinder {
  public TreeNode findNode(TreeNode root, int val) {
    Queue<TreeNode> q = new LinkedList<TreeNode>();
    if (root == null) {
      return null;
    }
    q.offer(root);
    while (!q.isEmpty()) {
      TreeNode tmpNode = q.poll();
      if (tmpNode != null) {
        if (tmpNode.data == val) {
          return tmpNode;
        }
        if (tmpNode.left != null) {
          q.offer(tmpNode.left);
        }
        if (tmpNode.right != null) {
          q.offer(tmpNode.right);
        }
      }
    }
    return null;
  }
}
