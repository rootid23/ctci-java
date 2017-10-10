package com.ctci.arrays;

// Rotate Matrix
// You are given a square 2D image matrix where each integer represents a pixel.
// Write a method rotateSquareImageCW to rotate the image clockwise - in-place.
// This problem can be broken down into simpler sub-problems you've already
// solved earlier!
// Rotating an image clockwise can be achieved by taking the transpose of the
// image matrix
// and then flipping it on its vertical axis.
// Example:Input image :
// 1 0
// 1 0
// Modified to :
// 1 1
// 0 0
public class A1_7 {
  public static void rotateSquareImageCW(int[][] matrix) {
    int s = 0, e = matrix.length - 1;
    // swap rows
    while (s < e) {
      int[] temp = matrix[s];
      matrix[s] = matrix[e];
      matrix[e] = temp;
      s++;
      e--;
    }
    // transpose matrix
    for (int i = 0; i < matrix.length; i++) {
      for (int j = i + 1; j < matrix[i].length; j++) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
      }
    }
  }
}
