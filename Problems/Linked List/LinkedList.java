class Node{
	int val;
	Node next;

	Node(int val){
		this.val = val;
	}
}



class LinkedList{
	
	LinkedList(){}

	Node first,last;


	void push(int val) {
		Node old = first;
		first = new Node(val);
		first.next = old;
	}

	void enqueue(int val) { //maintaining first,last pointer
		Node old = last;
		last = new Node(val);
		if(isempty()) first = last;
		else old.next = last;
	}


	int pop() {
		if(isempty()) return -1;
		else{
			int val = first.val;
			first = first.next;
			return val;
		}
	}

	int dequeue() {
		if (isempty()) return -1;
		int val = first.val;
		first = first.next;
		if(isempty()) last =null;
		return val;
	}

	Boolean isempty(){
		return first == null;
	}


}



class Stack{

	Stack(){}
 
	//  ^^^^ -> head

	// _____
	// _____
	// _____
	// STACK
	// _____
	// _____
	// _____


	//  ^^^^ -> tail

	LinkedList ll = new LinkedList();

	void push(int val){
		ll.push(val);
	}

	int pop(){
		return ll.pop();
	}

}

class Queue{

	Queue(){}

	LinkedList ll = new LinkedList();

	//   tail ->    |||||QUEUE|||||||    <- head

	void enqueue(int val) {
		ll.enqueue(val);
	}

	int dequeue(){
		return ll.dequeue();
	}

	Boolean isempty(){
		return ll.isempty();
	}
}
