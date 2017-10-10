package com.ctci.trees;

import org.junit.Assert;
import org.junit.Test;

public class SerializeTest {
  @Test
  public void serializeTree() {
    TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(4, null, null),
                                                 new TreeNode(5, null, null)),
                                 new TreeNode(3, null, null));
    Serialize serialize = new Serialize();
    String st = serialize.serializeTree(root);
    Assert.assertNotNull(null, st);
  }
}
