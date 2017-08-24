package com.ctci.stackqs;

import java.util.Stack;

//Stack Min: How would you design a stack which, in addition to push and pop,
//has a function min which returns the minimum element? Push, pop and min should all operate in 0(1) time.
//10,3,1,5
public class A3_2_2 {

  private Stack<Integer> stack;
  private Stack<Integer> minStack;

  A3_2_2 () {
    stack = new Stack<Integer>();
    minStack = new Stack<Integer>();
  }

  public void push(int x) {
    stack.push(x);
    if(minStack.isEmpty() || minStack.peek() >= x) {
      minStack.push(x);
    }
  }

  public int top() {
    if(!stack.isEmpty()) {
      return stack.peek();
    }
    throw new RuntimeException("stack is empty");
  }

  public void pop() {
    if(!stack.isEmpty()) {
      if(stack.peek().equals(minStack.peek())) {
        minStack.pop();
      }
      stack.pop();
    }
  }

  public int getMin() {
    if(!minStack.isEmpty())
      return minStack.peek();
    throw new NegativeArraySizeException("Stack is empty");
  }
}
