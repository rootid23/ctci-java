package com.ctci.graph;

import java.util.HashMap;
import java.util.Map;

public class Trie {
  class TrieNode {
    Character c;
    Boolean isLeaf = false;
    HashMap<Character, TrieNode> children = new HashMap<>();
    public TrieNode() {}
    public TrieNode(Character c) { this.c = c; }
  }

  private TrieNode root;

  // Implement these methods :
  public Trie() { root = new TrieNode(); }
  public void insertWord(String word) {
    if (word == null || word.length() < 1) return;
    HashMap<Character, TrieNode> childs = root.children;
    TrieNode tmp = root;
    char[] words = word.toCharArray();
    for (char c : words) {
      tmp = childs.getOrDefault(c, null);
      if (tmp == null)
        tmp = new TrieNode(c);
      else
        tmp = tmp.children.get(c);
    }
    tmp.isLeaf = true;
  }
  public Boolean searchWord(String word) {
    TrieNode tmp = root;
    if (tmp == null || word == null || word.length() < 1) return false;
    char[] words = word.toCharArray();
    Map<Character, TrieNode> childs = tmp.children;
    for (char c : words) {
      tmp = childs.getOrDefault(c, null);
      if (tmp == null) return false;
    }
    return tmp.isLeaf == true;
  }

  public Boolean searchPrefix(String word) {
    TrieNode tmp = root;
    if (tmp == null || word == null || word.length() < 1) return false;
    char[] words = word.toCharArray();
    Map<Character, TrieNode> childs = tmp.children;
    for (char c : words) {
      tmp = childs.getOrDefault(c, null);
      if (tmp == null) return false;
    }
    return tmp.isLeaf == false;
  }
}
