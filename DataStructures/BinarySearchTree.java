class BinarySearchTree {
	
	BinarySearchTree(){}

	Node root;

	private class Node {

		private String key;
		private String value;
		private Node left,right;
		private int count;

		Node(String key, String value){
			this.key = key;
			this.value = value;
		}


	}

	//puts key,value pair in BST 
	public void put(String key, String value){
		root = put(root, key, value);
	}

	//recursive method to insert
	public Node put(Node x, String key, String value){
		if(x == null) return new Node(key, value);
		int cmp = key.compareTo(x.key);
		if(cmp < 0) x.left = put(x.left, key, value);
		else if (cmp > 0) x.right = put(x.right, key, value);
		else x.value = value;
		x.count =1+size(x.right)+size(x.left);
		return x;
	}

	//gets value for the key
	public String get(String key){
		Node x = root;
		while(x!=null){
			int cmp  = key.compareTo(x.key);
			if (cmp < 0) x=x.left;
			else if (cmp > 0) x=x.right;
			else return x.value+"";
		}
		return null;
	}

	//deleted the key,value pair
	public void delete(String key){
		//need to implement
	}

	public int size(){
		return size(root);
	}

	public int size(Node x){
		if(x == null) return 0;
		return x.count;
	}

}