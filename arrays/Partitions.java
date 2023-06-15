package arrays;

public class Partitions {
  public static void main(String[] args) {
    int[] arr = { 1, 3, -4, 8, 0, 2, 2 };
    int[] psa = new int[arr.length];
    psa[0] = arr[0];
    for (int i = 1; i < arr.length; i++) {
      psa[i] = psa[i - 1] + arr[i];
    }
    int[] ssa = new int[arr.length];
    ssa[arr.length - 1] = arr[arr.length - 1];
    for (int i = arr.length - 2; i >= 0; i--) {
      ssa[i] = ssa[i + 1] + arr[i];
    }
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }
    if (sum % 3 != 0) { // not partitionable
      System.out.println(0);
      return;
    }
    int avg = sum / 3;
    int i = 0;
    int ctr = 0;
    while (i < psa.length) {
      if (psa[i] == avg) {
        int j = i + 2; // there should be atleast 1 el b/w the 1st and 3rd part
        while (j < ssa.length) {
          if (ssa[j] == avg)
            ctr++;
          j++;
        }
      }
      i++;
    }
    System.out.println(ctr);
  }
}