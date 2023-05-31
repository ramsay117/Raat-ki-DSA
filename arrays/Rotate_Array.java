package arrays;

public class Rotate_Array {
  public static void main(String[] args) {
    int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
    rotateArr(nums, 3);
    for (int i = 0; i < nums.length; i++) {
      System.out.print(nums[i] + " ");
    }
  }

  static void rotateArr(int[] nums, int k) {
    int n = nums.length;
    k = k % n;
    if (k < 0)
      k += n;
    reverse(nums, n - k, n - 1);
    reverse(nums, 0, n - k - 1);
    reverse(nums, 0, n - 1);
  }

  static void reverse(int[] nums, int i, int j) {
    while (i < j) {
      int temp = nums[i];
      nums[i] = nums[j];
      nums[j] = temp;
      i++;
      j--;
    }
  }
}
