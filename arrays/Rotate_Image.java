package arrays;

public class Rotate_Image {
  public static void main(String[] args) {
    int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
    for (int i = 0; i < matrix.length; i++) {
      for (int j = i + 1; j < matrix[0].length; j++) {
        swap(matrix, i, j); // i,j -> j,i
      }
    }
    for (int i = 0; i < matrix.length; i++) {
      reverse(matrix[i]);
    }
    display(matrix);
  }

  static void swap(int[][] matrix, int i, int j) {
    int temp = matrix[i][j];
    matrix[i][j] = matrix[j][i];
    matrix[j][i] = temp;
  }

  static void reverse(int[] arr) {
    int i = 0;
    int j = arr.length - 1;
    while (i < j) {
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
      i++;
      j--;
    }
  }

  static void display(int[][] matrix) {
    for (int[] row : matrix) {
      for (int col : row) {
        System.out.print(col + " ");
      }
      System.out.println();
    }
  }
}
