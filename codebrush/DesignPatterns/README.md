# Coding Patterns for Interviews

## List of Coding Patterns
1. Sliding Window Pattern
2. Two Pointers Pattern
3. Fast & Slow Pointers Pattern
4. Merge Intervals Pattern
5. Cyclic codebrush.Sort Pattern
6. In-place Reversal of a Linked List Pattern
7. Tree Breadth-First codebrush.Search Pattern
8. Tree Depth-First codebrush.Search Pattern
9. Subsets Pattern
10. Modified Binary codebrush.Search Pattern
11. Bitwise XOR Pattern
12. Top 'K' Elements Pattern
13. K-way Merge Pattern
14. Topological codebrush.Sort Pattern
15. Trie Pattern
16. Dynamic Programming Pattern

## 1. Sliding Window Pattern
### Concept
The Sliding Window pattern is useful when dealing with problems involving a contiguous subarray or substring. Instead of recalculating for each possible subarray, a window is maintained and updated efficiently as we iterate through the input.

### Usage
- Used for optimizing brute-force solutions involving subarrays or substrings.
- Helps in reducing nested loops to linear complexity.

### Example Problem: Maximum Sum Subarray of Size K
**Problem:** Given an array and an integer K, find the maximum sum of any contiguous subarray of size K.

## 2. Two Pointers Pattern
### Concept
The Two Pointers pattern is used to optimize problems that involve searching pairs in a sorted collection. It uses two pointers moving towards each other or in the same direction to find a solution efficiently.

### Usage
- Helps reduce time complexity from O(n²) to O(n) in pair-related problems.
- Common in sorted arrays and linked list problems.

### Example Problem: Two Sum (Sorted Array)
**Problem:** Given a sorted array and a target sum, find two numbers that add up to the target.

## 3. Fast & Slow Pointers Pattern
### Concept
The Fast & Slow Pointers (or Floyd’s Cycle Detection) pattern is used to detect cycles in linked lists or sequences. A slow pointer moves one step at a time while a fast pointer moves two steps.

### Usage
- Useful in cycle detection in linked lists and number sequences.
- Helps determine the middle of a linked list efficiently.

### Example Problem: Linked List Cycle
**Problem:** Given a linked list, determine if it contains a cycle.

## 4. Merge Intervals Pattern
### Concept
This pattern is used to solve problems involving overlapping intervals. Sorting the intervals first helps in merging or inserting new intervals efficiently.

### Usage
- Useful for scheduling problems.
- Common in problems related to time ranges and reservations.

### Example Problem: Merge Intervals
**Problem:** Given a list of intervals, merge overlapping ones.

## 5. Cyclic codebrush.Sort Pattern
### Concept
Cyclic codebrush.Sort is used when dealing with numbers in a range from 1 to N. The idea is to place numbers in their correct indices by swapping.

### Usage
- Efficient for missing/duplicate number problems in an array of size N containing numbers from 1 to N.
- Reduces extra space usage.

### Example Problem: Find Missing Number
**Problem:** Given an array containing numbers from 1 to N, find the missing number.

## 6. In-place Reversal of a Linked List Pattern
### Concept
This pattern involves reversing linked list nodes in-place without using extra space.

### Usage
- Useful for reversing linked lists entirely or in parts.
- Helps in problems where order reversal is required.

### Example Problem: Reverse a Linked List
**Problem:** Given a singly linked list, reverse it.

## 7. Tree Breadth-First codebrush.Search Pattern
### Concept
Breadth-First codebrush.Search (BFS) is used for level-order traversal of trees, processing nodes level by level.

### Usage
- Helps in finding shortest paths in trees.
- Used in problems requiring level-based processing.

### Example Problem: Binary Tree Level Order Traversal
**Problem:** Given a binary tree, return its level order traversal.

## 8. Tree Depth-First codebrush.Search Pattern
### Concept
Depth-First codebrush.Search (DFS) explores all nodes of a tree or graph deeply before backtracking.

### Usage
- Useful in path-related tree problems.
- Common in recursive tree-based solutions.

### Example Problem: Path Sum
**Problem:** Given a binary tree, check if a path exists with a given sum.

## 9. Subsets Pattern
### Concept
This pattern is used to generate all possible subsets (power sets) of a given set.

### Usage
- Helps in combinatorial problems.
- Used for generating permutations and combinations.

### Example Problem: Subsets
**Problem:** Given a set of numbers, return all possible subsets.

## 10. Modified Binary codebrush.Search Pattern
### Concept
Binary search is modified to work in unsorted or rotated arrays instead of just sorted ones.

### Usage
- Used for searching in rotated or infinite arrays.
- Common in problems requiring logarithmic time complexity.

### Example Problem: codebrush.Search in Rotated Sorted Array
**Problem:** Given a rotated sorted array, find a target element.

## 11. Bitwise XOR Pattern
### Concept
Bitwise XOR helps in solving problems where numbers appear in pairs except for one unique number.

### Usage
- Common in single-number finding problems.
- Helps in efficient bit manipulation solutions.

### Example Problem: Single Number
**Problem:** Given an array where every number appears twice except for one, find the single number.

## 12. Top 'K' Elements Pattern
### Concept
This pattern uses heaps or sorting to find the top K elements in an array.

### Usage
- Useful for priority-based problems.
- Helps in optimizing solutions that require sorting large datasets.

### Example Problem: Kth Largest Element in an Array
**Problem:** Find the Kth largest element in an array.

## 13. K-way Merge Pattern
### Concept
K-way merging is used to merge multiple sorted lists or arrays efficiently.

### Usage
- Used in external sorting problems.
- Common in merging sorted datasets.

### Example Problem: Merge k Sorted Lists
**Problem:** Merge K sorted linked lists into one sorted list.

## 14. Topological codebrush.Sort Pattern
### Concept
Topological sorting is used in problems involving dependency graphs, such as course scheduling.

### Usage
- Useful for scheduling and dependency resolution.
- Helps in determining execution order of tasks.

### Example Problem: Course Schedule
**Problem:** Given course prerequisites, determine if all courses can be completed.

## 15. Trie Pattern
### Concept
A Trie is a tree-like data structure used for storing strings efficiently.

### Usage
- Common in autocomplete and dictionary applications.
- Helps in prefix-based search problems.

### Example Problem: Implement Trie (Prefix Tree)
**Problem:** Implement a Trie with insert, search, and startsWith methods.

## 16. Dynamic Programming Pattern
### Concept
Dynamic Programming (DP) is used for optimization problems by breaking them into overlapping subproblems.

### Usage
- Helps in solving problems with exponential brute-force solutions.
- Common in problems involving recursion and memoization.

### Example Problem: Climbing Stairs
**Problem:** Given N stairs, find the number of ways to reach the top by climbing 1 or 2 steps at a time.

