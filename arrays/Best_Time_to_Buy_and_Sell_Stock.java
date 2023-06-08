package arrays;

public class Best_Time_to_Buy_and_Sell_Stock {
  public static void main(String[] args) {
    int[] prices = { 7, 1, 5, 3, 6, 4 };
    int profit = 0;
    int buy = prices[0];
    for (int i = 1; i < prices.length; i++) {
      if (prices[i] > buy) {
        profit = Math.max(profit, prices[i] - buy);
      } else {
        buy = prices[i];
      }
    }
    System.out.println(profit);
  }
}
