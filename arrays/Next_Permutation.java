package arrays;

public class Next_Permutation {
  public static void main(String[] args) {
    int[] nums = { 5, 7, 6, 4 };
    int j = nums.length - 1;
    while (j > 0 && nums[j - 1] >= nums[j]) {
      j--;
    }
    j--;

    for (int i = nums.length - 1; i > j && j >= 0; i--) { // swap w/ just greater(=6) from rt
      if (nums[i] > nums[j]) {
        swap(nums, i, j);
        break;
      }
    }
    reverse(nums, j + 1, nums.length - 1); // first greater was 6 so still increasing order from rt to j + 1;

    for (int i = 0; i < nums.length; i++) {
      System.out.print(nums[i] + " ");
    }
  }

  static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  static void reverse(int[] arr, int i, int j) {
    while (i < j) {
      swap(arr, i, j);
      i++;
      j--;
    }
  }
}
