package com.ctci.arrays;

import org.junit.Assert;
import org.junit.Test;

public class A1_3Test {

  @Test
  public void urliFyTest() {
    A1_3 a1_3 = new A1_3();
    String actual = a1_3.URLifyWithNoLen("Mr John Smith      ");
    Assert.assertEquals("Mr%20John%20Smith", actual);
    actual = a1_3.URLifyWithNoLen("Mr John S");
    Assert.assertEquals("Mr%20John%20S", actual);
    actual = a1_3.URLifyWithNoLen("Mr John   ");
    Assert.assertEquals("Mr%20John", actual);
  }

  @Test
  public void urliFyTest_1() {
      A1_3 a1_3 = new A1_3();
      String actual = a1_3.URLify("Mr John Smith    ",13);
      Assert.assertEquals("Mr%20John%20Smith", actual);
      actual = a1_3.URLify("Mr John S    ", 9);
      Assert.assertEquals("Mr%20John%20S", actual);
      actual = a1_3.URLify("Mr John  ", 7);
      Assert.assertEquals("Mr%20John", actual);
    }


}
