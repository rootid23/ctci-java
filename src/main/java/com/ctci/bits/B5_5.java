package com.ctci.bits;

public class B5_5 {
  // Power of 2
  // 0 & -1 = 0 , so discard 0
  public boolean isPowerOfTwo(int n) { return (n > 0) && (n & (n - 1)) == 0; }
}
