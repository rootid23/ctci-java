package com.ctci.stackqs;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.Test;

public class ValidParTest {
  @Test
  public void testParenthesis() {
    ValidPar.isValid("(){}[]");
  }

  @Test
  public void testSubString() {
    String s = "())()()";
    int[] radix = {(int)Math.pow(10, 9), 10 * (int)Math.pow(10, 5), 1000, 100};
    Map<Integer, Integer>[] map = new Map[3];
    map[0] = new HashMap<>(6);
    List<Integer>[] lst = new List[3];
    System.out.println(radix[0]);
    for (int i = 0; i < s.length(); i++) {
      String newStr = s.substring(0, i) + s.substring(i + 1);
      System.out.println(newStr);
    }
  }
}
