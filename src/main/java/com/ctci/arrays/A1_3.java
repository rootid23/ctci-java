package com.ctci.arrays;

/**
 * URLify: Write a method to replace all spaces in a string with '%20'.
 * You may assume that the string has sufficient space at the end to hold the additional characters,and that you are given the "true" length of the string.
 * (Note: If implementing in Java,please use a character array so that you can perform this operation in place.)
 * EXAMPLE
 * Input: "Mr John Smith ", 13 Output: "Mr%20John%20Smith"
 */
public class A1_3 {


  public String URLify(String iStr, int len) {
    char[] iArr = new char[iStr.length()];
    for(int i=0,idx=0;i<len;i++) {
      if(iStr.charAt(i) == ' ') {
        iArr[idx++] = '%';
        iArr[idx++] = '2';
        iArr[idx++] = '0';
      } else {
        iArr[idx++]  = iStr.charAt(i);
      }
    }
    return String.valueOf(iArr);
  }

  /**
   * // " abc test   " -> "abc%20test"
   * // "" - > ""
   * // null -> throw an exception
   *
   * @param iStr
   * @return
   */
  public String URLifyWithNoLen(String iStr) {
    String result = "";
    int start = 0;
    int end = 0;
    for (int j = iStr.length() - 1; j >= 0; j--) {
      if (iStr.charAt(j) != ' ') {
        end = j;
        break;
      }
    }
    for (int i = 0; i <= end; i++) {
      if (iStr.charAt(i) == ' ') {
        result += iStr.substring(start, i);
        result += "%20";
        start = i + 1;
      }
    }
    if (start < end+1) {
      result += iStr.substring(start, end + 1);
    }
    return result;
  }

}
