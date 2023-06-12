package arrays;

public class Minimum_Lights_to_Activate {
  public static void main(String[] args) {
    int[] A = { 1, 0, 1, 0, 0, 0, 1 };
    int B = 3;
    int ctr = 0;
    for (int i = 0; i < A.length; i++) {
      int pos = -1;
      int rtmost = i + (B - 1);
      int leftmost = i - (B - 1);

      int j = rtmost;
      while (j >= leftmost) {
        if (j < A.length && j >= 0 && A[j] == 1) {
          pos = j;
          ctr++;
          break;
        }
        j--;
      }
      if (pos == -1) {
        System.out.println(-1);
        return;
      }
      i = pos + (B - 1);
    }
    System.out.println(ctr);
  }
}
