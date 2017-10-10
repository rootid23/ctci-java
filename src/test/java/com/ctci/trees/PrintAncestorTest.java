package com.ctci.trees;

import org.junit.Assert;
import org.junit.Test;

public class PrintAncestorTest {
  @Test
  public void testAncestor() {
    PrintAncestor printAncestor = new PrintAncestor();
    TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(4, null, null),
                                                 new TreeNode(5, null, null)),
                                 new TreeNode(3, null, null));
    printAncestor.printAncestors(root, 5);
    Assert.assertTrue(printAncestor.ancestorsList == null);
    printAncestor.ancestorsList.forEach(str -> System.out.println(str));
  }
}
