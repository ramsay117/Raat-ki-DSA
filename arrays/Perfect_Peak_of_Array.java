package arrays;

public class Perfect_Peak_of_Array {
  public static void main(String[] args) {
    int[] A = { 5, 1, 4, 3, 6, 8, 10, 7, 9 };
    int n = A.length;
    int[] pmax = new int[n];
    int[] smin = new int[n];
    pmax[0] = A[0];
    smin[n - 1] = A[n - 1];
    for (int i = 1; i < A.length; i++) {
      pmax[i] = Math.max(pmax[i - 1], A[i]);
      smin[n - 1 - i] = Math.min(smin[n - i], A[n - 1 - i]);
    }
    for (int i = 1; i < n - 1; i++) {
      if (A[i] > pmax[i - 1] && A[i] < smin[i + 1]) {
        System.out.println(A[i]);
        return;
      }
    }
    System.out.println(-1);
  }
}