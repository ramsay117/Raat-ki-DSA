package arrays;

public class Reach_a_Number {
  public static void main(String[] args) {
    int target = 4;
    int move = 1; // upcoming move
    int pos = 0;
    boolean dir = target > 0;
    while ((dir && pos < target) || (!dir && pos > target) || Math.abs(pos - target) % 2 != 0) {
      if (dir)
        pos += move;
      else
        pos -= move;
      move++;
    }
    System.out.println(move - 1);
  }
}
