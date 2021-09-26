class Solution {

	Solution(){}

	public static void main(String[] args) {
		
		BinaryTreeTraversal traversal = new BinaryTreeTraversal();

		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);


			// 		   1                     
			//        / \       
			//       /   \      
			//      /     \     
			//     /       \    
			//     2       3       
			//    / \     / \   
			//   /   \   /   \  
			//   4   5   6   7     

			// 	   CONSTRUCTED TREE

			// InOrder -> left, root, right

		System.out.print("InOrder : ");
		traversal.inOrder(root);
		System.out.println();

			// PostOrder -> left, right, root

		System.out.print("PostOrder : ");
		traversal.postOrder(root);
		System.out.println();

			// PreOrder -> root, left, right

		System.out.print("PreOrder : ");
		traversal.preOrder(root);
		System.out.println();

			// Level Order -> Print by level from top to bottom

		System.out.print("LevelOrder : ");
		traversal.levelOrder(root);
		System.out.println();

			// Level Order -> Print by level from bottom to top

		System.out.print("ReverseLevelOrder : ");
		traversal.reverseLevelOrder(root);
		System.out.println();

			// Adding element for view clarity
		root.left.left.right = new TreeNode(8);


			//        1
			// 	   	 / \       
			//      /   \      
			//     /     \     
			//    /       \    
			//    2       3       
			//   / \     / \   
			//  /   \   /   \  
			//  4   5   6   7   
			//   \ 
    		//    8   
			//   TREE AFTER ADDING ELEMENT

			// Print the elements of tree viewed from right side

		System.out.print("Elements from Right View : ");
		traversal.rightView(root);
		System.out.println();

			// Print the elements of tree viewed from left side 
		
		System.out.print("Elements from Left View : ");
		traversal.leftView(root);
		System.out.println();


			// Print the elements of tree viewed from top side 
		
		System.out.print("Elements from Top View : ");
		traversal.topView(root);
		System.out.println();

			// Print the elements of tree viewed from top side 
		
		System.out.print("Elements from Bottom View : ");
		traversal.bottomView(root);
		System.out.println();

		/*-------------------------PROPERTIES-----------------------*/

		BinaryTree properties = new BinaryTree();

	}
}