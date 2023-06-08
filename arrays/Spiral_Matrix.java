package arrays;

public class Spiral_Matrix {
  public static void main(String[] args) {
    int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
    int n = matrix.length;
    int m = matrix[0].length;
    int rs = 0;
    int cs = 0;
    int re = n - 1;
    int ce = m - 1;
    int ctr = 0;
    while (ctr < n * m) {
      for (int j = cs; j <= ce && ctr < n * m; j++) {
        System.out.print(matrix[rs][j] + " ");
        ctr++;
      }
      rs++;
      for (int i = rs; i <= re && ctr < n * m; i++) {
        System.out.print(matrix[i][ce] + " ");
        ctr++;
      }
      ce--;
      for (int j = ce; j >= cs && ctr < n * m; j--) {
        System.out.print(matrix[re][j] + " ");
        ctr++;
      }
      re--;
      for (int i = re; i >= rs && ctr < n * m; i--) {
        System.out.print(matrix[i][cs] + " ");
        ctr++;
      }
      cs++;
    }
  }
}
