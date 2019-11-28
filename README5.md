# p5.jave is Problem 9, Perfect Squares

Given a positive integer n, find the least number of perfect square numbers (for example, 1, 4, 9, 16, ...) which sum to n.
Example 1:
Input: n = 12
Output: 3 
Explanation: 12 = 4 + 4 + 4.
Example 2:
Input: n = 13
Output: 2
Explanation: 13 = 4 + 9.


# Process
This is actually from the discussion section in Leetcode, which helped me understand the problem better, although it looks like a
simple solutoion, I was a bit confused as to how they came up with the perfect squares, but then realized I read too deep into it,
a perfect square is just i*i, 1*1=1, 2*2=4, 3*3=9, 4*4=16 etc. The way this was implemented to solve this was by using dynamic programming 
dp[i] = Math.min(dp[i-j*j] + 1, dp[i]), and has demonstrated to me that using an array is the way to go when using dynamic programming once 
again. We first have a case in case N = 0, to return 0, then we fillup every element in our dynamic programming array to Max_Value, to help us
when iterating through the array. Then we look for the minimum square when we are multiplying j*j +1 and within the array.
