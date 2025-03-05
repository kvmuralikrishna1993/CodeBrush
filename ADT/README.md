# Abstract Data Types (ADT)

## Overview
The ADT folder contains implementations of various abstract data structures, essential for problem-solving and algorithm design. Each structure includes operations and their respective time complexities.

## List of Data Structures

### 1. **Linked List**
- Singly Linked List
- Doubly Linked List
- Circular Linked List

| Operation      | Singly Linked List | Doubly Linked List | Circular Linked List |
|--------------|------------------|------------------|------------------|
| Access       | O(n)             | O(n)             | O(n)             |
| Search       | O(n)             | O(n)             | O(n)             |
| Insertion    | O(1) (Head) / O(n) (Tail) | O(1) (Head) / O(n) (Tail) | O(1) (Head) / O(n) (Tail) |
| Deletion     | O(1) (Head) / O(n) (Tail) | O(1) (Head) / O(n) (Tail) | O(1) (Head) / O(n) (Tail) |

### 2. **Stacks** (LIFO)
- Implemented using arrays or linked lists

| Operation  | Time Complexity |
|------------|----------------|
| Push       | O(1)           |
| Pop        | O(1)           |
| Peek       | O(1)           |

### 3. **Queues** (FIFO)
- Standard Queue
- Circular Queue
- Priority Queue

| Operation  | Standard Queue | Circular Queue | Priority Queue |
|------------|---------------|---------------|---------------|
| Enqueue    | O(1)          | O(1)          | O(log n)     |
| Dequeue    | O(1)          | O(1)          | O(log n)     |
| Peek       | O(1)          | O(1)          | O(1)         |

### 4. **Binary Trees**
- Binary Tree
- Binary Search Tree (BST)
- AVL Tree
- Red-Black Tree

| Operation  | Binary Tree | BST | AVL Tree | Red-Black Tree |
|------------|------------|-----|----------|---------------|
| Search     | O(n)       | O(log n) | O(log n) | O(log n) |
| Insertion  | O(n)       | O(log n) | O(log n) | O(log n) |
| Deletion   | O(n)       | O(log n) | O(log n) | O(log n) |

### 5. **Heaps**
- Min Heap
- Max Heap
- Binary Heap

| Operation  | Binary Heap |
|------------|------------|
| Insert     | O(log n)   |
| Delete     | O(log n)   |
| Get Min/Max | O(1)      |

### 6. **Union-Find (Disjoint Set)**
- Quick Find
- Quick Union
- Weighted Quick Union

| Operation        | Quick Find | Quick Union | Weighted Quick Union + Path Compression |
|-----------------|------------|-------------|--------------------------------------|
| Find           | O(1)       | O(n)        | O(α(n)) (Almost O(1))             |
| Union          | O(n)       | O(n)        | O(α(n)) (Almost O(1))             |

## Summary
This folder contains various data structures with optimized implementations. The time complexity tables help understand the efficiency of operations, aiding in selecting the right structure for different problem scenarios.

