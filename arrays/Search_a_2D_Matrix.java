package arrays;

public class Search_a_2D_Matrix {
  public static void main(String[] args) {
    int[][] matrix = { { 11, 12, 13, 14 }, { 21, 22, 23, 24 }, { 31, 32, 33, 34 }, { 41, 42, 43, 44 } };
    int target = 32;
    int m = matrix.length;
    int n = matrix[0].length;
    int i = 0;
    while (i < m) {
      if (matrix[i][n - 1] == target) {
        System.out.println("Found");
        return;
      } else if (matrix[i][n - 1] < target)
        i++;
      else {
        bs(matrix[i], target);
        return; // stop finding in the next rows
      }
    }
    System.out.println("Not Found"); // when i >= m
  }

  static void bs(int[] arr, int target) {
    int s = 0, e = arr.length - 1;
    while (s <= e) {
      int mid = s + (e - s) / 2;
      if (arr[mid] == target) {
        System.out.println("Found");
        return;
      } else if (arr[mid] < target)
        s = mid + 1;
      else
        e = mid - 1;
    }
    System.out.println("Not Found");
  }
}
