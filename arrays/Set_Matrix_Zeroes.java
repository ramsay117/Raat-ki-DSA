package arrays;

public class Set_Matrix_Zeroes {
  public static void main(String[] args) {
    int[][] matrix = { { 1, 2, 3, 4 }, { 5, 0, 7, 8 }, { 0, 10, 11, 12 }, { 13, 14, 15, 0 } };
    boolean fr = false; // first row
    boolean fc = false; // first col
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        if (matrix[i][j] == 0) {
          matrix[0][j] = 0;
          matrix[i][0] = 0;
          if (i == 0)
            fr = true;
          if (j == 0)
            fc = true;
        }
      }
    }
    // travelling first row
    for (int j = 1; j < matrix[0].length; j++) {
      if (matrix[0][j] == 0) {
        setCZero(matrix, j);
      }
    }
    // travelling first col
    for (int i = 1; i < matrix.length; i++) {
      if (matrix[i][0] == 0) {
        setRZero(matrix, i);
      }
    }
    if (fr)
      setRZero(matrix, 0);
    if (fc)
      setCZero(matrix, 0);

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }

  static void setCZero(int[][] matrix, int col) {
    for (int i = 0; i < matrix.length; i++) {
      matrix[i][col] = 0;
    }
  }

  static void setRZero(int[][] matrix, int row) {
    for (int j = 0; j < matrix[0].length; j++) {
      matrix[row][j] = 0;
    }
  }
}
