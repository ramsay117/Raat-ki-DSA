package arrays;

public class Make_Equal_elements_Array {
  public static void main(String[] args) {
    int[] A = { 2, 4, 3 };
    int x = 2;
    int minEl = A[0];
    for (int i = 1; i < A.length; i++) {
      if (A[i] < minEl) {
        minEl = A[i];
      }
    }
    int target = minEl + x;
    for (int i = 0; i < A.length; i++) {
      if (!(A[i] == target || A[i] + x == target || A[i] - x == target)) {
        System.out.println(false);
        return;
      }
    }
    System.out.println(true);
  }
}
