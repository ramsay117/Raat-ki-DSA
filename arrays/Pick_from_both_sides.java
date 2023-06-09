package arrays;

public class Pick_from_both_sides {

  public static void main(String[] args) {
    int[] nums = { 5, -2, 3, 1, 2 };
    int k = 3;

    int n = nums.length;
    int[] psa1 = new int[n]; // l to r
    int[] psa2 = new int[n]; // r to l
    psa1[0] = nums[0];
    psa2[0] = nums[n - 1];
    for (int i = 1; i < n; i++) {
      psa1[i] = psa1[i - 1] + nums[i];
      psa2[i] = psa2[i - 1] + nums[n - i - 1];
    }

    int maxi = psa1[k - 1]; // k els from psa1
    for (int i = k - 1; i >= 0; i--) { // pick k-1 els from psa1 and 1 from psa2
      if (i == 0)
        maxi = Math.max(maxi, psa2[k - 1]);
      else
        maxi = Math.max(maxi, psa1[i - 1] + psa2[k - i - 1]);
    }
    System.out.println(maxi);
  }
}
