class Stack{

	Stack(){}
	Node first;
 
	//  ^^^^ -> Last In First Out [LIFO]

	// _____
	// _____
	// _____
	// STACK
	// -----
	// _____
	// _____


	//  ^^^^ -> (first in)

	void push(int val) {
		Node old = first;
		first = new Node(val);
		first.next = old;
	}

	int pop() {
		if(isempty()) return -1;
		else{
			int val = first.val;
			first = first.next;
			return val;
		}
	}

	Boolean isempty(){
		return first == null;
	}


}
