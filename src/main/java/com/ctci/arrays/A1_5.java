package com.ctci.arrays;

// One Edit Distance
// Given two strings S and T, determine if they are both one edit distance
// apart.
// Input:  s1 = "geeks", s2 = "geek"
// Output: yes
// Number of edits is 1
// Input:  s1 = "geeks", s2 = "geeks"
// Output: no
// Number of edits is 0
// Input:  s1 = "geaks", s2 = "geeks"
// Output: yes
// Number of edits is 1
// Input:  s1 = "peaks", s2 = "geeks"
// Output: no
// Number of edits is 2
public class A1_5 {
  public static boolean onwAway(String s1, String s2) {
    int m = s1.length();
    int n = s2.length();
    int pidx = 0;
    int sidx = Math.min(m, n);
    int oneWayDist = Math.max(m, n) - 1;
    while (pidx < m && pidx < n) {
      if (s1.charAt(pidx) == s2.charAt(pidx))
        pidx++;
      else
        break;
    }
    while (sidx-- > 0) {
      if (s1.charAt(sidx) != s2.charAt(sidx)) break;
    }
    sidx = Math.max(sidx, 0);
    return oneWayDist == pidx + sidx;
  }

  public static boolean isOneEditDistance(String s, String t) {
    int m = s.length(), n = t.length();
    if (Math.abs(m - n) > 1) return false;
    int k = Math.min(m, n);
    int i = 0, j = 0;
    while (i < k && s.charAt(i) == t.charAt(i)) ++i;
    while (j < k - i && s.charAt(m - 1 - j) == t.charAt(n - 1 - j)) ++j;
    return m + n - k - 1 == i + j;
  }
}
