package com.ctci.arrays;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

/**
 * Test class for IsUniq.
 */
public class IsUniqTest {
  @Test
  public void testIsAllUniqueNullString() {
    boolean result = IsUniq.isAllUnique(null);
    Assert.assertEquals(true, result);
  }

  @Test
  public void testIsAllUnique() {
    boolean result = IsUniq.isAllUnique("");
    Assert.assertEquals(true, result);
  }

  @Test
  public void testIsAllUniqueFalse() {
    boolean result = IsUniq.isAllUnique("babb");
    Assert.assertEquals(false, result);
  }

  @Test
  public void testIsAllUniqueSpecialChars() {
    boolean result = IsUniq.isAllUnique("b%%%_");
    Assert.assertEquals(false, result);
  }

  @Test(expected = RuntimeException.class)
  public void testIsAllUniqueUnicodeChars() {
    IsUniq.isAllUnique("ēēēēēē");
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
    boolean result = IsUniq.isAllUnique(str);
    Assert.assertEquals(false, result);
  }
}
