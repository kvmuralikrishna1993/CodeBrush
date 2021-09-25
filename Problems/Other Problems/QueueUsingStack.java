import java.util.Stack;

class QueueUsingStack {

	QueueUsingStack(){}

	Stack<Integer> stack = new Stack<>();
	Stack<Integer> temp = new Stack<>();

	void enqueue(int num) {

		while(!stack.isEmpty()) temp.push(stack.pop());
		stack.push(num);
		while(!temp.isEmpty()) stack.push(temp.pop());
	}

	int dequeue(){

		if(!stack.isEmpty()) return stack.pop();
		else return -1;

	}

	Boolean isEmpty() {

		return stack.isEmpty();
	}
}