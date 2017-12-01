package com.ctci.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

//Flip Game
//You are playing the following Flip Game with your friend: Given a string that contains only these two characters: + and -, you and your friend take turns to flip two consecutive "++" into "--". The game ends when a person can no longer make a move and therefore the other person will be the winner.
//Write a function to compute all possible states of the string after one valid move.
//For example, given s = "++++", after one move, it may become one of the following states:
//[
//  "--++",
//  "+--+",
//  "++--"
//]
//If there is no valid move, return an empty list [].


public class JumpGame {

  static List<String> generatePossibleNextMoves(String s) {
    List<String> result = new LinkedList<>();
    if(s == null || s.length() <= 1) return result;
    int len = s.length();
    for(int i=0;i<len - 1;) {
      if(s.charAt(i) == s.charAt(++i) && s.charAt(i) == '+') {
        result.add(s.substring(0,i-1)+ "--" + s.substring(i+1) );
        int[] A = {1,2,3};
        Arrays.stream(A).sum();
      }
    }
    return result;
  }


  public List<String> generatePossibleNextMoves1(String s) {
    List list = new ArrayList();
    for (int i=-1; (i = s.indexOf("++", i+1)) >= 0; )
      list.add(s.substring(0, i) + "--" + s.substring(i+2));
    return list;
  }

}
