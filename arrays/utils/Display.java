package arrays.utils;

public class Display {
  public static void array(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void array(int[] arr, int s, int e) {
    for (int i = s; i <= e; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }
}
