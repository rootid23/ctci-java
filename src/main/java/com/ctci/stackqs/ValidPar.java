package com.ctci.stackqs;

import java.util.Stack;

public class ValidPar {
  public static boolean isValid(String s) {
    Stack<Character> stk = new Stack<>();
    for (Character c : s.toCharArray()) {
      switch (c) {
        case '{':
          stk.push('}');
          break;
        case '(':
          stk.push(')');
          break;
        case '[':
          stk.push(']');
          break;
        case '}':
        case ']':
        case ')':
          if (stk.isEmpty() || stk.pop() != c) return false;
      }
    }
    if (!stk.isEmpty()) return false;
    return true;
  }
}
