
public class p2 {
	
	//PROBLEM 2
	public int minFallingPathSum(int[][] A) {
        for (int i = A.length-2; i >= 0; i--) {
            for (int j = 0; j < A.length; j++) {
                int path = A[i+1][j];
                if (j > 0)
                    path = Math.min(path, A[i+1][j-1]);
                if (j+1 < A.length)
                    path = Math.min(path, A[i+1][j+1]);
                A[i][j] += path;
            }
        }

        int ans = 0;
        for (int x: A[0])
            ans = Math.min(ans, x);
        return ans;
        
    }
}
