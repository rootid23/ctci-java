package com.ctci.dp;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Pascal2 {
  public List<Integer> getRow(int rowIndex) {
    rowIndex++;
    int[] result = new int[rowIndex];
    result[0] = 1;
    result[rowIndex - 1] = 1;
    for (int i = 1; i < rowIndex; i++) {
      int first = result[i - 1];
      for (int j = 1; j < i - 1; i++) {
        int second = result[i];
        result[i] = first + second;
        first = second;
      }
    }
    return Arrays.stream(result).boxed().collect(Collectors.toList());
  }
}
