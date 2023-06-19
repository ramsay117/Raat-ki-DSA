package arrays;

public class Balance_Array {
  public static void main(String[] args) {
    int[] A = { 5, 5, 2, 5, 8 };
    int n = A.length;
    int[] ep = new int[n]; // even prefix sum
    int[] op = new int[n];
    ep[0] = A[0];
    op[0] = 0;
    for (int i = 1; i < n; i++) {
      if (i % 2 == 0) {
        ep[i] = A[i] + ep[i - 1];
        op[i] = op[i - 1];
      } else {
        op[i] = A[i] + op[i - 1];
        ep[i] = ep[i - 1];
      }
    }
    int[] es = new int[n]; // even suffix sum
    int[] os = new int[n];
    if ((n - 1) % 2 == 0) {
      es[n - 1] = A[n - 1];
      os[n - 1] = 0;
    } else {
      os[n - 1] = A[n - 1];
      es[n - 1] = 0;
    }
    for (int i = n - 2; i >= 0; i--) {
      if (i % 2 == 0) {
        es[i] = A[i] + es[i + 1];
        os[i] = os[i + 1];
      } else {
        os[i] = A[i] + os[i + 1];
        es[i] = es[i + 1];
      }
    }

    int ctr = 0;
    for (int i = 0; i < n; i++) {
      if (ep[i] + os[i] == op[i] + es[i])
        ctr++;
    }
    System.out.println(ctr);
  }
}