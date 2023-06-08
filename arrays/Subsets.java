package arrays;

public class Subsets {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3 };
    int limit = 2 << (arr.length - 1);
    for (int i = 0; i < limit; i++) {
      int num = i;
      String str = "";
      // ceil of log 7 base 2 is 3
      for (int j = 0; j < arr.length; j++) {
        if (num % 2 == 1)
          str = arr[j] + " " + str;
        else
          str = "- " + str;
        num /= 2;
      }
      System.out.println(str);
    }
  }
}
