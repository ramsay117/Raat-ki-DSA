package arrays;

public class Sort_Colors {
  public static void main(String[] args) {
    int[] nums = { 2, 0, 2, 1, 1, 0 };
    int j = 0;
    int k = nums.length - 1;
    for (int i = 0; i <= k; i++) {
      if (nums[i] == 0) {
        nums[i] = nums[j];
        nums[j] = 0;
        j++;
      } else if (nums[i] == 2) {
        nums[i] = nums[k];
        nums[k] = 2;
        k--;
        i--; // to check what el comes from k
      }
    }
  }
}
