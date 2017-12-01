package com.ctci.arrays;

import java.util.Random;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test class for A1_1.
 */
public class A1_1Test {
  @Test
  public void testIsAllUniqueNullString() {
    boolean result = A1_1.isAllUnique(null);
    Assert.assertEquals(true, result);
  }

  @Test
  public void testIsAllUnique() {
    boolean result = A1_1.isAllUnique("");
    Assert.assertEquals(true, result);
  }

  @Test
  public void testIsAllUniqueFalse() {
    boolean result = A1_1.isAllUnique("babb");
    Assert.assertEquals(false, result);
  }

  @Test
  public void testIsAllUniqueSpecialChars() {
    boolean result = A1_1.isAllUnique("b%%%_");
    Assert.assertEquals(false, result);
  }

  @Test(expected = RuntimeException.class)
  public void testIsAllUniqueUnicodeChars() {
    A1_1.isAllUnique("ēēēēēē");
  }

  @Test
  public void testIsAllUniqueStringGT128() {
    Random random = new Random();
    final int MAX_CHAR_LIMIT = 128;
    String str = "";
    for (int i = 0; i < MAX_CHAR_LIMIT + 10; i++) {
      int nextInt = random.nextInt() % MAX_CHAR_LIMIT;
      str += nextInt;
    }
    boolean result = A1_1.isAllUnique(str);
    Assert.assertEquals(false, result);
  }
}
