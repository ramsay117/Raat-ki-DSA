package arrays;

public class Flip {
  public static void main(String[] args) {
    String A = "0011101";
    int s = -1;
    int j = -1;
    int e = -1;
    int ctr = 0;
    int overallBest = 0;
    boolean moveJ = true;
    for (int i = 0; i < A.length(); i++) {
      if (A.charAt(i) == '0') {
        if (ctr == 0 && moveJ) {
          j = i;
          moveJ = false;
        }
        ctr++;
      } else
        ctr--; // bc 1 will be flipped to 0
      if (ctr > overallBest) {
        overallBest = ctr;
        e = i;
        s = j;
      } else if (ctr < 0) {
        ctr = 0;
        moveJ = true;
      }
    }
    System.out.println(s + " " + e);
  }
}