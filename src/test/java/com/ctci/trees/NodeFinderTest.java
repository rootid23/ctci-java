package com.ctci.trees;

import org.junit.Test;

public class NodeFinderTest {


//       1
//      / \
//     2   3
//    / \ / \
//   4  5 6  7
  @Test
  public void testFindNode() {
    TreeNode root = new TreeNode(1, new TreeNode(2,
      new TreeNode(4, null, null), new TreeNode(5, null, null)), new TreeNode(3, null, null));
    NodeFinder nodeFinder = new NodeFinder();
    nodeFinder.findNode(root, 4);
  }

}
