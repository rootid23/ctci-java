package com.ctci.stackqs;

import java.util.Stack;

// Stack Min: How would you design a stack which, in addition to push and pop,
// has a function min which returns the minimum element? Push, pop and min
// should all operate in 0(1) time.
// 10,3,1,5
// Idea : store the gap between the min value and the current value;
public class A3_2 {
  long min = Integer.MAX_VALUE;
  Stack<Long> stack;

  public A3_2() { stack = new Stack<Long>(); }

  public void push(int x) {
    stack.push((long)x - min);
    min = Math.min(x, min);
  }

  public void pop() {
    if (stack.isEmpty()) {
      throw new RuntimeException("Stack is empty.");
    }
    min = Math.max(min - stack.pop(), min);
  }

  public int top() { return (int)Math.max(stack.peek() + min, min); }

  public int getMin() { return (int)min; }
}
