package arrays;

public class Check_Rotated_Sorted {
  public static void main(String[] args) {
    int[] nums = { 2, 1, 3, 4 };
    int spike = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > nums[(i + 1) % nums.length]) { // compare last w/ first
        spike++;
      }
    }
    System.out.println(spike <= 1); // only one spike is allowed
  }
}
