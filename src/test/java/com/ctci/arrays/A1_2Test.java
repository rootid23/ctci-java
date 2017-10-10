package com.ctci.arrays;

import org.junit.Assert;
import org.junit.Test;

public class A1_2Test {
  @Test
  public void testPermutation() {
    A1_2 a1_2 = new A1_2();
    Boolean actual = a1_2.isValid("tre", "ret");
    Assert.assertEquals(Boolean.TRUE, actual);

    actual = a1_2.isValid("tre", "reT");
    Assert.assertEquals(Boolean.TRUE, actual);

    actual = a1_2.isValid("tre", null);
    Assert.assertEquals(Boolean.FALSE, actual);

    actual = a1_2.isValid("tre", "itre");
    Assert.assertEquals(Boolean.FALSE, actual);

    actual = a1_2.isValid(null, null);
    Assert.assertEquals(Boolean.TRUE, actual);
  }
}
