package com.ctci.bits;

/**
 */
public class PowerOfFour {
  public boolean powerOfFour(int num) {
    // return ((num & (num-1)) == 0) && ( (num & 0x55) == num);
    return (num > 0) && ((num & 0x55555555) == num) && ((num & (num - 1)) == 0);
  }
}
