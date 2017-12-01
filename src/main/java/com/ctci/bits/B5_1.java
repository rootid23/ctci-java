package com.ctci.bits;

// You are given two 32 bit numbers, N and M, and two bit positions,
// i and j. Write a method to insert M into N such that M starts at
// bit j and ends at bit i. You can assume that bits j through i have
// enough space to fit all of M. That is, if M = 10011, you can assume
// that there are at least 5 bits between j and i. You would not for example,
// have j = 3 and i = 2, because M could not fully fit between bit 3 and bit 2.
//
// Example :
// Input N = 10000000000, M = 10011, i = 2, j = 6
// Output N = 10001001100
public class B5_1 {
  //############### NOTE : Only use of left shift ###############
  public static int insertMIntoN(int n, int m, int i, int j) {
    int allOnes = -1;
    int setLeftMask = allOnes << (j + 1);
    int setRightMask = ((1 << i) - 1);
    int mask = setLeftMask | setRightMask;
    int nCleared = n & mask;
    int mShifted = m << i;
    return nCleared | mShifted;
  }
}
