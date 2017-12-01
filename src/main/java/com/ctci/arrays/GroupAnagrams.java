package com.ctci.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
  public List<List<String>> groupAnagrams(String[] strs) {
    Map<String, List<String>> map = new HashMap<>();
    for (String str : strs) {
      char[] ar = str.toCharArray();
      Arrays.sort(ar);
      String key = String.valueOf(ar);
      map.computeIfAbsent(key, v -> new ArrayList<>()).add(str);
    }
    return new ArrayList<>(map.values());
  }
}
