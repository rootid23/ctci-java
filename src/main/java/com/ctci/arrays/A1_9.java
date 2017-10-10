package com.ctci.arrays;

// Assume you have a method isSubstring which checks if one word is a substring
// of another.
// Given two strings, s1 and s2, write code to check if s2 is a rotation of s1
// using only one call to isSubstring (i.e., “waterbottle” is a rotation of
// “erbottlewat”)

public class A1_9 {
  // precondition : s1 <= s2
  public static boolean isSubstring(String s1, String s2) {
    if (s2.indexOf(s1) != -1) return true;
    return false;
  }

  public static boolean isStringRotation(String s1, String s2) {
    if (s1.length() != s2.length()) return false;
    String tmp = s2 + s2;  // concatenate v/s stringbuffer.append
    return isSubstring(s1, tmp);
  }
}
