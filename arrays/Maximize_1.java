package arrays;

public class Maximize_1 {
  public static void main(String[] args) {
    int[] arr = { 1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1 };
    int m = 2;
    int ctr = 0;
    int res = 0;
    int s = 0; // start
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == 0) {
        if (ctr == m) {
          res = Math.max(res, i - s);
          while (arr[s] != 0) {
            s++;
          }
          ctr--;
          s++; // moving fwd from last/left 0
        }
        ctr++;
      }
    }
    res = Math.max(res, arr.length - s);
    System.out.println(res);
  }
}
