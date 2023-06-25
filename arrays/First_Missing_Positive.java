package arrays;

public class First_Missing_Positive {
  public static void main(String[] args) {
    int[] nums = { 3, 4, -1, 1 };
    int n = nums.length;
    for (int i = 0; i < n; i++) {
      int el = nums[i];
      if (el > 0) {
        int idealPos = el - 1;
        if (idealPos < n) {
          swap(nums, i, idealPos);
          if (nums[i] != nums[idealPos] && idealPos > i)
            i--;
        }
      }
    }
    for (int i = 0; i < n; i++) {
      if (nums[i] != i + 1) {
        System.out.println(i + 1);
        break;
      }
    }
    System.out.println(n + 1);
  }

  static void swap(int[] nums, int i, int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
  }
}
