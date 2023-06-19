package arrays;

public class Find_the_Duplicate_Number {
  public static void main(String[] args) {
    int[] nums = { 3, 1, 3, 4, 2 };
    for (int i = 0; i < nums.length; i++) {
      int el = Math.abs(nums[i]);
      int dest = nums[el];
      if (dest < 0) {
        System.out.println(el);
        break;
      }
      nums[el] = -dest;
    }
  }
}
