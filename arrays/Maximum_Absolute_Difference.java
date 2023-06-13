package arrays;

public class Maximum_Absolute_Difference {
  public static void main(String[] args) {
    int[] A = { 1, 3, -1 };

    /*
     * |A[i] - A[j]| + |i - j|
     * 
     * 1. A[i] - A[j] + i - j, A[i] > A[j] && i > j 3,5 (A[i] + i) - (A[j] + j)
     * 2. A[i] - A[j] + j - i, A[i] > A[j] && i < j 5,3 (A[i] - i) - (A[j] - j)
     * 3. -A[i] + A[j] + i - j, A[i] < A[j] && i > j 5,3 - (A[i] - i) + (A[j] - j)
     * 4. -A[i] + A[j] + j - i, A[i] < A[j] && i < j 3,5 - (A[i] + i) + (A[j] + j)
     */

    int[] arr1 = new int[A.length];
    int[] arr2 = new int[A.length];

    for (int i = 0; i < A.length; i++) {
      arr1[i] = A[i] + i;
      arr2[i] = A[i] - i;
    }

    int maxi = arr1[0];
    int mini = arr1[0];
    for (int i = 1; i < arr1.length; i++) {
      if (arr1[i] > maxi) {
        maxi = arr1[i];
      }
      if (arr1[i] < mini) {
        mini = arr1[i];
      }
    }
    int overallBest = maxi - mini;
    maxi = arr2[0];
    mini = arr2[0];
    for (int i = 1; i < arr2.length; i++) {
      if (arr2[i] > maxi) {
        maxi = arr2[i];
      }
      if (arr2[i] < mini) {
        mini = arr2[i];
      }
    }
    overallBest = Math.max(overallBest, maxi - mini);
    System.out.println(overallBest);
  }
}
