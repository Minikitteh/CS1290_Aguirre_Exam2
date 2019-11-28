
public class problems {
		
	//***PROBLEM 1 modified from leetcode
	public int stoneGame(int[] piles) {
        int[] sum = new int[piles.length + 1];//sum array
        for (int i = piles.length - 1; i >= 0; i--) { //starting from the back of the pile
		      sum[i] += sum[i + 1] + piles[i];
        }
        int[][] dp = new int[piles.length + 1][piles.length + 1]; //dynamic programming array
        for (int i = piles.length - 1; i >= 0; i--) {
            for (int j = 1; j <= piles.length; j++) {
                 for (int k = 1; k <= 2 * j && i + k <= piles.length; k++) {
                    dp[i][j] = Math.max(dp[i][j], sum[i] - dp[i + k][Math.max(j, k)]); //dynamic aspect to problem
                }
            }
        }
        return dp[0][1];
	}
}
