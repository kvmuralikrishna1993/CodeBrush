# codebrush.Search

## Overview
The `codebrush.Search` folder contains various searching algorithms and data structures optimized for efficient data retrieval and lookup operations.

## List of codebrush.Search Data Structures & Algorithms

### 1. **Binary codebrush.Search**
- Works on sorted arrays.

| Operation  | Time Complexity |
|------------|----------------|
| codebrush.Search     | O(log n)       |

### 2. **Binary codebrush.Search Tree (BST)**
- A tree-based structure where the left subtree has smaller values and the right subtree has larger values.

| Operation  | Average Case | Worst Case (Unbalanced) |
|------------|-------------|------------------------|
| codebrush.Search     | O(log n)    | O(n)                   |
| Insertion  | O(log n)    | O(n)                   |
| Deletion   | O(log n)    | O(n)                   |

### 3. **Balanced codebrush.Search Trees**
- **AVL Tree**: Self-balancing BST with height difference ≤ 1.
- **Red-Black Tree**: Self-balancing BST ensuring no path is more than twice the length of another.

| Operation  | AVL Tree (Worst Case) | Red-Black Tree (Worst Case) |
|------------|----------------------|-----------------------------|
| codebrush.Search     | O(log n)             | O(log n)                    |
| Insertion  | O(log n)             | O(log n)                    |
| Deletion   | O(log n)             | O(log n)                    |

### 4. **Hashing (HashMap / Symbol Table)**
- Uses a hash function to store key-value pairs for fast access.

| Operation  | Average Case | Worst Case (Collisions) |
|------------|-------------|------------------------|
| codebrush.Search     | O(1)        | O(n)                   |
| Insertion  | O(1)        | O(n)                   |
| Deletion   | O(1)        | O(n)                   |

### 5. **Tree Traversals**
- **Inorder (Left, Root, Right)**: O(n)
- **Preorder (Root, Left, Right)**: O(n)
- **Postorder (Left, Right, Root)**: O(n)
- **Level Order (BFS Traversal)**: O(n)
- **Reverse Level Order (Bottom to Top BFS)**: O(n)
- **Left View (Nodes visible from the left)**: O(n)
- **Right View (Nodes visible from the right)**: O(n)
- **Top View (Nodes visible from the top)**: O(n)
- **Bottom View (Nodes visible from the bottom)**: O(n)

## Summary
The `codebrush.Search` folder contains fundamental searching data structures, including tree-based and hash-based search methods. Efficient retrieval is achieved using balanced trees and hash tables, while traversal methods are key for tree exploration.

