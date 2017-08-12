package com.ctci.arrays;

import java.util.Arrays;

/**
 *Check Permutation: Given two strings,write a method to decide if one is a permutation of the
 other.
 */
public class A1_2 {
  //upper + lowercase
  //str,tSr => true
  //str,tbr => false
  //T : O(n log n)
  public Boolean isValid(String iStr, String pStr) {

    if (iStr == pStr || iStr.equalsIgnoreCase(pStr)) {
      return true;
    }

    if (iStr != null && pStr != null && iStr.length() == pStr.length()) {
      iStr = iStr.toLowerCase();
      pStr = pStr.toLowerCase();
      char[] iChars = iStr.toCharArray();
      Arrays.sort(iChars);
      char[] pChars = pStr.toCharArray();
      Arrays.sort(pChars);
      String iStrD = String.valueOf(iChars);
      String pStrD = String.valueOf(pChars);
      return iStrD.equalsIgnoreCase(pStrD);
    }
    return false;
  }
}
