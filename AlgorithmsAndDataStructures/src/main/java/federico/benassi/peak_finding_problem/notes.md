# Peak Finding Problem

Analyze and resolve big problems with large problems

Concerns:

1. Efficient Procedures to solve large scale problems
2. Scalability
3. Classic Data Structures(BSTs, Hash Tables, Balanced BSTs) for Sorting and Matching Problems

One Dimensional: peak finding runs on array of numbers

a b c d e f g h i

1 2 3 4 5 6 7 8 9

a - i are numbers

position 2 is a peak if and only if b >= a and b >= c

in case of the edges you only have to watch at one side

Find the peak if it exists ( Prove that always has a peak )

Worst case complexity is O(n), you have to control all the elements, is LINEAR

How can we do better? Divide and Conquer

Two Dimensional

n rows and m columns

a >= bcde