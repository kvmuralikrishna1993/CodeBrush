import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;


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

		if(node == null) return;

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

		if(node == null) return;

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

		if(node == null) return;

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

		if(node == null) return;

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

	void topView(TreeNode node){

		if(node == null) return;

		Queue<QueueObj> queue = new LinkedList<>();

		queue.add(new QueueObj(node, 0)); // <- initial point [root]
		Map<Integer,TreeNode> map = new TreeMap<>();

		while(!queue.isEmpty()){
			QueueObj temp = queue.poll();
			if(!map.containsKey(temp.hd)) map.put(temp.hd,temp.node);
			if(temp.node.left != null) queue.add(new QueueObj(temp.node.left, temp.hd-1));
			if(temp.node.right != null) queue.add(new QueueObj(temp.node.right, temp.hd+1));
		}

		for (Entry<Integer,TreeNode> entry : map.entrySet()) System.out.print(entry.getValue().val);

	}

	void bottomView(TreeNode node){

		if(node == null) return;

		Queue<QueueObj> queue = new LinkedList<>();

		queue.add(new QueueObj(node, 0)); // <- initial point [root]
		Map<Integer,TreeNode> map = new TreeMap<>();

		while(!queue.isEmpty()){
			QueueObj temp = queue.poll();
			map.put(temp.hd,temp.node); // <- remove condition. 
			if(temp.node.left != null) queue.add(new QueueObj(temp.node.left, temp.hd-1));
			if(temp.node.right != null) queue.add(new QueueObj(temp.node.right, temp.hd+1));
		}

		for (Entry<Integer,TreeNode> entry : map.entrySet()) System.out.print(entry.getValue().val);

	}

}

class QueueObj{
			
	QueueObj(){}

	TreeNode node;
	int hd;

	QueueObj(TreeNode node, int hd){
		this.node = node;
		this.hd = hd;
	}

}

