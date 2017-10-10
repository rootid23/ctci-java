package com.ctci.backtrack;

import java.util.ArrayList;

public class Problem1800 {
  public static ArrayList<String> getStringsFromNums(String digits) {
    String[] mapper = {"abc", "def",  "ghi", "jkl",
                       "mno", "pqrs", "tuv", "wxyz"};
    char[] input = digits.toCharArray();
    ArrayList<String> result = new ArrayList<>();
    StringBuilder sb = new StringBuilder();
    getStringsFromNumsHelper(mapper, input, 0, 0, sb, result);
    return result;
  }

  private static void getStringsFromNumsHelper(String[] mapper, char[] input,
                                               int j, int k,
                                               StringBuilder localSb,
                                               ArrayList<String> result) {
    int m = input.length;
    if (k > m) return;
    if (m == localSb.length()) {
      result.add(localSb.toString());
      return;
    }
    int cIdx = input[k] - '0' - 2;
    for (int vidx = 0; vidx < mapper[cIdx].length(); vidx++) {
      localSb.append(mapper[cIdx].charAt(vidx));
      getStringsFromNumsHelper(mapper, input, vidx, k + 1, localSb, result);
      localSb.setLength(localSb.length() - 1);
    }
  }
}
