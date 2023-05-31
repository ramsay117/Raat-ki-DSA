package arrays;

public class Remove_Duplicates_Sorted {
  public static void main(String[] args) {
    int[] nums = { 1, 2, 2, 3, 4, 4, 4, 5, 5, 6 };
    int k = 1;
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] != nums[i - 1]) {
        nums[k] = nums[i];
        k++;
      }
    }
    System.out.println(k);
  }
}
