package com.ctci.arrays;

import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class JumpGameTest {
  @Test
  public void jumpTest() {
    int[][] rst = new int[0][0];

    List<String> lst = JumpGame.generatePossibleNextMoves("++++");
    Assert.assertEquals(3, lst.size());
  }
}
