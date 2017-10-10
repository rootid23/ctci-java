package com.ctci.stackqs;

import org.junit.Assert;
import org.junit.Test;

public class A3_2Test {
  @Test
  public void testA3_2() {
    A3_2 a3_2 = new A3_2();
    a3_2.push(-2);
    a3_2.push(0);
    a3_2.push(-2);
    a3_2.push(-3);
    a3_2.push(-4);
    Assert.assertEquals(a3_2.getMin(), -4);
    a3_2.pop();
    Assert.assertEquals(a3_2.top(), -3);
    a3_2.pop();
    Assert.assertEquals(a3_2.getMin(), -2);
    Assert.assertEquals(a3_2.top(), -2);
    a3_2.pop();
    Assert.assertEquals(a3_2.getMin(), -2);
  }
}
