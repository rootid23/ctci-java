package com.ctci.trees;

import org.junit.Test;

public class ConnectTest {
  @Test
  public void testConnect() {
    TreeLinkNode treeLinkNode = new TreeLinkNode(1);
    treeLinkNode.left = new TreeLinkNode(2);
    treeLinkNode.right = new TreeLinkNode(3);
    treeLinkNode.left.left = new TreeLinkNode(4);
    treeLinkNode.right.right = new TreeLinkNode(5);
    Connect.connect(treeLinkNode);
  }
}
