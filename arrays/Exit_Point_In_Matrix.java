package arrays;

public class Exit_Point_In_Matrix {
  public static void main(String[] args) {
    int[][] matrix = { { 0, 0, 1, 0 }, { 1, 0, 0, 0 }, { 0, 0, 0, 0 }, { 1, 0, 1, 0 } };
    int dir = 0; // east
    int i = 0;
    int j = 0;
    while (i < matrix.length && j < matrix[0].length && i >= 0 && j >= 0) {
      if (matrix[i][j] == 1) {
        dir = (dir + 1) % 4;
        matrix[i][j] = 0;
      }
      if (dir == 0) {
        j++;
      } else if (dir == 1) {
        i++;

      } else if (dir == 2) {
        j--;
      } else {
        i--;
      }
    }
    if (i < 0) {
      i++;
    } else if (i == matrix.length) {
      i--;
    } else if (j < 0) {
      j++;
    } else {
      j--;
    }
    System.out.println(i + ", " + j);
  }
}
