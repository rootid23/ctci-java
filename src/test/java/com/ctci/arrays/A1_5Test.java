package com.ctci.arrays;

import org.junit.Assert;
import org.junit.Test;

public class A1_5Test {
  @Test
  public void oneAwayTest() {
    boolean actual = A1_5.onwAway("geeks", "geek");
    Assert.assertEquals(true, actual);
    actual = A1_5.onwAway("pale", "ple");
    Assert.assertEquals(true, actual);
    actual = A1_5.onwAway("pele", "ple");
    Assert.assertEquals(true, actual);
    actual = A1_5.onwAway("pale", "bake");
    Assert.assertEquals(false, actual);
    actual = A1_5.onwAway("geeks", "geeks");
    Assert.assertEquals(false, actual);
    actual = A1_5.onwAway("geeks", "peaks");
    Assert.assertEquals(false, actual);
  }

  @Test
  public void oneEditDistance() {
    boolean actual = A1_5.isOneEditDistance("geeks", "geek");
    Assert.assertEquals(true, actual);
    actual = A1_5.isOneEditDistance("pale", "ple");
    Assert.assertEquals(true, actual);
    actual = A1_5.isOneEditDistance("pele", "ple");
    Assert.assertEquals(true, actual);
    actual = A1_5.isOneEditDistance("pale", "bake");
    Assert.assertEquals(false, actual);
    actual = A1_5.isOneEditDistance("geeks", "geeks");
    Assert.assertEquals(false, actual);
    actual = A1_5.isOneEditDistance("geeks", "peaks");
    Assert.assertEquals(false, actual);
  }
}
