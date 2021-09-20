class Solution {

	Solution(){}
	// Each Method is refered with respective input

	public static void main(String[] args) {
		
		// Adding data to Binary Tree for Test Cases.

		BinaryTree BT = new BinaryTree();
		BT.root = new Node(1);
		BT.root.left = new Node(2);
		BT.root.right = new Node(3);
		BT.root.left.left = new Node(4);
		BT.root.left.right = new Node(5);
		BT.root.right.left = new Node(6);
		BT.root.right.right = new Node(7);


			// 		   1                     
			//        / \       
			//       /   \      
			//      /     \     
			//     /       \    
			//     2       3       
			//    / \     / \   
			//   /   \   /   \  
			//   4   5   6   7     

			// 	   TREE DIAGRAM AFTER ADDING ELEMENTS

			// InOrder -> left, root, right

		System.out.print("InOrder : ");
		BT.printInOrder();
		System.out.println();

			// PostOrder -> left, right, root

		System.out.print("PostOrder : ");
		BT.printPostOrder();
		System.out.println();

			// PreOrder -> root, left, right

		System.out.print("PreOrder : ");
		BT.printPreOrder();
		System.out.println();

	}
}