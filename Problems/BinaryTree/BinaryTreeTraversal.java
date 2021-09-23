import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


class TreeNode{
	int val;
	TreeNode right,left;
	TreeNode(int val){
		this.val = val;
	}
}


class BinaryTreeTraversal{

	BinaryTreeTraversal(){}

	void inOrder(TreeNode node){

		if(node == null) return;
		inOrder(node.left);
		System.out.print(node.val);
		inOrder(node.right);

	}

	void postOrder(TreeNode node){

		if(node == null) return;
		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.val);

	}

	void preOrder(TreeNode node){

		if(node == null) return;
		System.out.print(node.val);
		preOrder(node.left);
		preOrder(node.right);

	}

	void levelOrder(TreeNode node){

		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(node);

		while(!queue.isEmpty()) {
			TreeNode nodeData = queue.poll();
			System.out.print(nodeData.val);
			if(nodeData.left != null) queue.add(nodeData.left);
			if(nodeData.right != null) queue.add(nodeData.right);
		}

	}

	void reverseLevelOrder(TreeNode node){

		Stack<Integer> stack = new Stack<>(); // <- add stack to store 

		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(node);

		while(!queue.isEmpty()){
			TreeNode nodeData =  queue.poll();
			stack.add(nodeData.val); // <- add to stack instead of printing.
			if(nodeData.left != null) queue.add(nodeData.left);
			if(nodeData.right != null) queue.add(nodeData.right);
		}

		while(!stack.isEmpty()) System.out.print(stack.pop()); // <- print the elements in stack
	
	}

	void leftView(TreeNode node){

		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(node);

		while(!queue.isEmpty()){

			int len = queue.size();
			for (int i = 0; i< len ; i++ ) {
				TreeNode nodeData = queue.poll();
				if(i == len -1) System.out.print(nodeData.val);
				if(nodeData.left != null) queue.add(nodeData.left);
				if(nodeData.right != null) queue.add(nodeData.right);
			}
		}

	}

	void rightView(TreeNode node){

		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(node);

		while(!queue.isEmpty()){

			int len = queue.size();
			for (int i = 0; i< len ; i++ ) {
				TreeNode nodeData = queue.poll();
				if(i == 0) System.out.print(nodeData.val); // <- Change the condition. Thats it.
				if(nodeData.left != null) queue.add(nodeData.left);
				if(nodeData.right != null) queue.add(nodeData.right);
			}
		}
	
	}

}
