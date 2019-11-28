import java.util.Arrays;

public class p5 {
	//
	public int numSquares(int n) {
        long dp[] = new long[n+1];
        if(n == 0) return 0;
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for(int i=1; i<=n; i++){
          for(int j=1; j*j <= i;j++){
              dp[i] = Math.min(dp[i-j*j] + 1, dp[i]);
            }
          }
        return (int)dp[n];
    }
}
