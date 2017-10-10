package com.ctci.bits;

import org.junit.Assert;
import org.junit.Test;

public class B5_1Test {

  @Test
  public void testBitReversal() {
    int result = B5_1.insertMIntoN(1024,19,2,6);
    Assert.assertEquals(1100, result);
  }
}
