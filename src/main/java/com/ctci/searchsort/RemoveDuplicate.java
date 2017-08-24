package com.ctci.searchsort;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

//Given a List of Strings, write a method removeDuplicates that removes duplicate words from the List and returns an ArrayList of all the unique words. The returned ArrayList should be lexically alphabetically.
//Input: [Hi, Hello, Hey, Hi, Hello, Hey]
//Output: [Hello, Hey, Hi]

public class RemoveDuplicate {

  public static ArrayList<String> removeDuplicates(List<String> input) {
    Set set = new TreeSet<String>();
    set.addAll(input);
    return new ArrayList<String>(set);
  }

}
