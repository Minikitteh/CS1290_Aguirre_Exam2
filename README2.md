# P2.java Min falling path sum

Given a square array of integers A, we want the minimum sum of a falling path through A.
A falling path starts at any element in the first row, and chooses one element from each row.  The next row's choice must be in a column that is different from the previous row's column by at most one.
Example 1:
Input: [[1,2,3],[4,5,6],[7,8,9]]
Output: 12
Explanation: 
The possible falling paths are:
•	[1,4,7], [1,4,8], [1,5,7], [1,5,8], [1,5,9]
•	[2,4,7], [2,4,8], [2,5,7], [2,5,8], [2,5,9], [2,6,8], [2,6,9]
•	[3,5,7], [3,5,8], [3,5,9], [3,6,8], [3,6,9]
The falling path with the smallest sum is [1,4,7], so the answer is 12.
 Note:
1.	1 <= A.length == A[0].length <= 100
2.	-100 <= A[i][j] <= 100


# Process
The way I visualized the problem, was by actually vissuallizing the graph as a square
[1,2,3]  ↓  Once i did the i was able to properly think what the problem was asking effectively. Now my main problem was how
[4,5,6]  ↓  to implement it. I struggled of thinking of a way, and due to time constraints, I looked up the explanation on leetcode
[7,8,9]  ↓


This is the recursive process for the dynamic aspect of this problem:

path = Math.min(path, A[i+1][j+1]) & path = Math.min(path, A[i+1][j-1])

This is to get the minimum path from your columns, when you first start off at i = 0, you are starting out at your first row, from there you check the next row for which path will give you a smaller sum, by getting the minimum and so on, until you have set the minimum path, then we return it.
