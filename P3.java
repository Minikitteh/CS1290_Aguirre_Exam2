
public class P3 {
	//PROBLEM 4 ARITHMIC SLICES from leetcode
	//A = [1, 2, 3, 4]
	//return: 3, for 3 arithmetic slices in A: 
	//[1, 2, 3], [2, 3, 4] and [1, 2, 3, 4] itself.

	 public int numberOfArithmeticSlices(int[] A) {
	        int count = 0;
		for (int i = 0; i < A.length - 2; i++) {
			int d = A[i + 1] - A[i];
			for (int j = i + 2; j < A.length; j++) {
				if (A[j] - A[j - 1] == d)
					count++;
				else
					break;
			}
		}
		return count;
	}
}
