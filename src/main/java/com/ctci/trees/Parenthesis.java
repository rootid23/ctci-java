package com.ctci.trees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Parenthesis {
  public static ArrayList<String> combParenthesis(int pairs) {
    ArrayList<ArrayList<String> > lists = new ArrayList<>();
    // ArrayList<String> tmpString = new ArrayList<>();
    // tmpString.add("");
    // lists.add(tmpString);
    lists.add(new ArrayList<String>(Collections.singletonList("")));
    lists.add(new ArrayList<String>(Collections.singletonList("")));
    for (int i = 1; i <= pairs; ++i) {
      final ArrayList<String> list = new ArrayList<>();
      for (int j = 0; j < i; ++j) {
        for (final String first : lists.get(j)) {
          for (final String second : lists.get(i - 1 - j)) {
            list.add("(" + first + ")" + second);
          }
        }
      }
      lists.add(list);
    }
    return lists.get(lists.size() - 1);
  }
}
