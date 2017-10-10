package com.ctci.arrays;

// Write an algorithm such that if an element in an MxN matrix is 0, its entire
// row and column is set to 0.

public class A1_8 {
  // Idea : Projection technique (2D - 1D)
  public static void zeroMatrix(int[][] mat) {
    int m = mat.length;
    int n = mat[0].length;
    boolean isFirstRCZero = false;
    if (mat[0][0] == 0) isFirstRCZero = true;
    for (int i = 1; i < m; i++)
      for (int j = 1; j < n; j++)
        if (mat[i][j] == 0) {
          mat[0][j] = 0;
          mat[i][0] = 0;
        }

    for (int i = 1; i < m; i++)
      if (mat[i][0] == 0) {
        int j = 0;
        while (j++ < m) mat[i][j] = 0;
      }

    for (int j = 1; j < n; j++)
      if (mat[0][j] == 0) {
        int i = 0;
        while (i++ < n) mat[i][j] = 0;
      }
    if (isFirstRCZero == true) {
      int i = 0;
      int j = 0;
      while (j++ < n) mat[0][j] = 0;
      while (i++ < m) mat[i][0] = 0;
    }
  }
}
