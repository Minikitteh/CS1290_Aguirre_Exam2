# Problem 4 Aritmic Slices
A sequence of number is called arithmetic if it consists of at least three elements and if the difference between any two consecutive elements is the same.
For example, these are arithmetic sequence:
1, 3, 5, 7, 9
7, 7, 7, 7
3, -1, -5, -9
The following sequence is not arithmetic.
1, 1, 2, 5, 7

A zero-indexed array A consisting of N numbers is given. A slice of that array is any pair of integers (P, Q) such that 0 <= P < Q < N.
A slice (P, Q) of array A is called arithmetic if the sequence:
A[P], A[p + 1], ..., A[Q - 1], A[Q] is arithmetic. In particular, this means that P + 1 < Q.
The function should return the number of arithmetic slices in the array A. 
Example: 
A = [1, 2, 3, 4]

return: 3, for 3 arithmetic slices in A: [1, 2, 3], [2, 3, 4] and [1, 2, 3, 4] itself.


# Process
For this problem, I thought it would be simple to implement, because it is quick to trace and to test it, unforunately due to time constraints, I looked it up on leetcode, so I could understand it's implementation quickly. The code was slightly modified from leetcode, but remains the same. The way the code works, is that we use brute force to determine the arithmic slices. It increments the counter for everytimea slice is found. It does this by getting a number in front of its current stadpoint then gets that number then subtracts the current number from it to get the difference between them, then looks though the array if the difference between the previous number and the current number is equal to the previously calculated difference, and if so adds it to the amount of possible slices, then re-calculates the next difference.
