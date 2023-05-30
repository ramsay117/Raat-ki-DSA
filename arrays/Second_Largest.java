package arrays;

public class Second_Largest {
  public static void main(String[] args) {
    int[] arr = { 12, 35, 1, 10, 34, 1 };
    int lar = arr[0];
    int sl = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > lar) {
        sl = lar;
        lar = arr[i];
      } else if (arr[i] > sl && arr[i] != lar) {
        sl = arr[i];
      }
    }
    System.out.println(sl);
  }
}
