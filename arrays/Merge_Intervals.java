package arrays;

import java.util.Stack;

public class Merge_Intervals {
  public static void main(String[] args) {
    int[][] intervals = { { 1, 2 }, { 6, 7 }, { 4, 9 }, { 3, 5 }, { 8, 10 }, { 12, 16 } };
    sort(intervals);
    Stack<int[]> st = new Stack<>();
    st.push(intervals[0]);
    for (int i = 1; i < intervals.length; i++) {
      if (intervals[i][0] <= st.peek()[1]) {
        int[] popped = st.pop();
        int[] newInterval = { popped[0], Math.max(intervals[i][1], popped[1]) };
        st.push(newInterval);
      } else {
        st.push(intervals[i]);
      }
    }
    int[][] res = new int[st.size()][2];
    while (st.size() > 0) {
      res[st.size() - 1] = st.pop();
    }
    for (int i = 0; i < res.length; i++) {
      System.out.println(res[i][0] + " " + res[i][1]);
    }
  }

  static void sort(int[][] intervals) {
    for (int i = 0; i < intervals.length - 1; i++) {
      for (int j = i + 1; j < intervals.length; j++) {
        if (intervals[i][0] > intervals[j][0]) {
          int[] temp = intervals[i];
          intervals[i] = intervals[j];
          intervals[j] = temp;
        }
      }
    }
  }
}
