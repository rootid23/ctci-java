package com.ctci.dp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pascal {

  public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> rowList = new ArrayList(Arrays.asList(1));
    result.add(rowList);
    for(int i=1;i<numRows;i++) {
      rowList =  new ArrayList(Arrays.asList(1,1));
      for(int j=1;j<i;j++)
        rowList.add(j, result.get(i-1).get(j-1) + result.get(i-1).get(j));
      result.add(rowList);
    }
    return result;
  }

}
