package com.ctci.bits;

/**
 */
public class UTF8Validator {
  public static boolean validUtf8(int[] data) {
    int noOfOctet = 0;
    for (int d : data) {
      if (noOfOctet == 0) {
        if (((d >>> 4) & 0xF) == 0xF)
          noOfOctet += 3;
        else if (((d >>> 5) & 0x7) == 0x7)
          noOfOctet += 2;
        else if (((d >>> 6) & 0x3) == 0x3)
          noOfOctet += 1;
        else if (((d >>> 7) & 1) == 1)
          return false;
      } else {
        if (((d >>> 6) & 0x2) == 0x2)
          noOfOctet -= 1;
        else
          return false;
      }
    }
    return noOfOctet == 0;
  }
}
