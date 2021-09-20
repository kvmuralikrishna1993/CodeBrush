class Node{
	int val;
	Node right,left;
	Node(int val){
		this.val = val;
	}
}


class BinaryTree{

	Node root;

	BinaryTree(){

	}

	void printInOrder(){
		printInOrder(root);
	}

	void printInOrder(Node node){
		if(node == null) return;
		printInOrder(node.left);
		System.out.print(node.val);
		printInOrder(node.right);
	}

	void printPostOrder(){
		printPostOrder(root);
	}

	void printPostOrder(Node node){
		if(node == null) return;
		printPostOrder(node.left);
		printPostOrder(node.right);
		System.out.print(node.val);
	}

	void printPreOrder(){
		printPreOrder(root);
	}

	void printPreOrder(Node node){
		if(node == null) return;
		System.out.print(node.val);
		printPreOrder(node.left);
		printPreOrder(node.right);
	}

}
