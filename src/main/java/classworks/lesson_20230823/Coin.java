package classworks.lesson_20230823;

public class Coin {
  public static void main(String[] args) {
    int[] array = {25, 10, 5, 1};
    int number = 63;
    System.out.println(minCoins(array, number));
  }

  public static int minCoins(int[] arr, int num) {
    int[] dp = new int[num + 1];
    for (int i = 1; i <= num; i++) {
      dp[i] = Integer.MAX_VALUE;
    }
    dp[0] = 0;

    for (int coin : arr) {
      for (int i = coin; i <= num; i++) {
        if (dp[i - coin] != Integer.MAX_VALUE) {
          dp[i] = Math.min(dp[i], dp[i - coin] + 1);
        }
      }
    }
    return dp[num] == Integer.MAX_VALUE ? -1 : dp[num];
  }
}
