package arrays;

public class Missing_And_Repeating {
  public static void main(String[] args) {
    int[] A = { 2, 3, 1, 5, 3 };
    for (int i = 0; i < A.length; i++) {
      int dest = A[i] - 1;
      if (A[i] != i + 1 && A[i] != A[dest]) {
        int temp = A[dest];
        A[dest] = A[i];
        A[i] = temp;
        i--;
      }
    }
    for (int i = 0; i < A.length; i++) {
      if (A[i] != i + 1) {
        System.out.println("Repeating number is: " + A[i]);
        System.out.println("Missing number is: " + (i + 1));
        break;
      }
    }
  }
}
