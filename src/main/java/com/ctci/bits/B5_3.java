package com.ctci.bits;

// Flip bit to Win : Flip exactly 1 bit. WAP to find the length of longest
// sequence of 1s you could create.
// eg. 1775 (1101101111) o/p : 8
public class B5_3 {
  // For this case m = 1
  int maxOnes(int[] arr, int m) {
    int len = arr.length;

    if (len == 0) return 0;

    int i, count = 0, start = 0, maxlength = 0;
    for (i = 0; i < len; i++) {
      if (arr[i] == 0) count++;
      if (count > m) {
        while (arr[start] != 0) start++;  //
        start++;                          // if found another zero
        count--;
      }
      maxlength = Math.max(maxlength, i - start + 1);
    }
    return maxlength;
  }

  //#sliding window with wL and wR
  // m is maximum of number zeroes allowed to flip
  public void findZeroes(int[] arr, int m) {
    // Left and right indexes of current window
    int wL = 0, wR = 0;
    // Left index and size of the widest window
    int bestL = 0, bestWindow = 0;
    // Count of zeroes in current window
    int zeroCount = 0;
    // While right boundary of current window doesn't cross
    // right end
    while (wR < arr.length) {
      // If zero count of current window is less than m,
      // widen the window toward right
      if (zeroCount <= m) {
        if (arr[wR] == 0) zeroCount++;
        wR++;
      }
      // If zero count of current window is more than m,
      // reduce the window from left
      if (zeroCount > m) {
        if (arr[wL] == 0) zeroCount--;
        wL++;
      }

      // Update widest window if this window size is more
      if (wR - wL > bestWindow) {
        bestWindow = wR - wL;
        bestL = wL;
      }
    }

    // Print positions of zeroes in the widest window
    for (int i = 0; i < bestWindow; i++) {
      if (arr[bestL + i] == 0) System.out.print(bestL + i + " ");
    }
  }
}
