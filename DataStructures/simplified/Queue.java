class Queue{

	Queue(){}

	Node first,last;

	//   (last in) ->    |||||QUEUE|||||||    -> First In First Out [FIFO]
	
	void enqueue(int val) { //maintaining first,last pointer
		Node old = last;
		last = new Node(val);
		if(isempty()) first = last;
		else old.next = last;
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
