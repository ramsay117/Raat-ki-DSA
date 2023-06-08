package arrays;

public class Maximum_Subarray {
  public static void main(String[] args) {
    int[] nums = { 4, 3, -2, -6, 8 };
    int overallBest = nums[0];
    int runningSum = nums[0];
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] < 0)
        overallBest = Math.max(overallBest, runningSum);
      if (runningSum < 0)
        runningSum = nums[i];
      else
        runningSum += nums[i];
    }
    overallBest = Math.max(overallBest, runningSum);
    System.out.println(overallBest);
  }
}
