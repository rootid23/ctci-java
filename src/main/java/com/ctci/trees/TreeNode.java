package com.ctci.trees;

// public class TreeNode<Key extends Comparable <Key>> {
public class TreeNode {
  //  Key data;
  int data;
  TreeNode left;
  TreeNode right;

  TreeNode(int data) { this.data = data; }

  TreeNode(int data, TreeNode left, TreeNode right) {
    this.data = data;
    this.left = left;
    this.right = right;
  }
}
