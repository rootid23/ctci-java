package com.ctci.arrays;

public class IsUniq {
  public static final int MAX_CHAR_LIMIT = 128;

  /**
   * Assumptions : input string has only lower/upper case letters [a-z|A-Z].
   * T : O(n) , S : O(K=26)
   * @param string
   * @return
   */
  public static boolean isAllUnique(String string) {
    if (string == null) {
      return true;
    }
    if (string.length() > MAX_CHAR_LIMIT) {
      return false;
    }
    boolean[] charIdxMap = new boolean[MAX_CHAR_LIMIT];
    for (int i = 0; i < string.length(); i++) {
      int rank = string.charAt(i);
      if (rank > MAX_CHAR_LIMIT) {
        throw new RuntimeException(
            "Only upper and lower case letters are allowed.");
      }
      if (charIdxMap[rank]) {
        return false;
      }
      charIdxMap[rank] = true;
    }
    return true;
  }
}
