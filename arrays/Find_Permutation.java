package arrays;

public class Find_Permutation {
  public static void main(String[] args) {
    int n = 5;
    String str = "DIDD";
    int currMax = n;
    int currMin = 1;
    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      if (ch == 'D') {
        System.out.print(currMax + " ");
        currMax--;
      } else {
        System.out.print(currMin + " ");
        currMin++;
      }
    }
    System.out.println(currMax); // or currMin
  }
}