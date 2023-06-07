package arrays;

public class Subarray_Sum_Equals_K {
  public static void main(String[] args) {
    int[] nums = { 1, 2, 3 };
    int k = 3;
    int[] psa = new int[nums.length + 1];
    psa[0] = 0;
    for (int i = 1; i < psa.length; i++) {
      psa[i] = psa[i - 1] + nums[i - 1]; // psa[i] <- nums[i - 1]
    }
    int ctr = 0;
    for (int i = 0; i < psa.length - 1; i++) {
      for (int j = i + 1; j < psa.length; j++) {
        if (psa[j] - psa[i] == k) {
          ctr++;
        }
      }
    }
    System.out.println(ctr);
  }
}
