package com.ctci.bits;

import org.junit.Assert;
import org.junit.Test;

/**
 */
public class UTF8ValidatorTest {
  @Test
  public void testUTF8() {
    int[] data = {197, 130, 1};
    boolean result = UTF8Validator.validUtf8(data);
    Assert.assertEquals(true, result);
  }
}
