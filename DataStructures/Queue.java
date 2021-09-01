class Queue {
	Queue(){}

	LinkedList obj = new LinkedList();

	public void enqueue(String item){
		obj.addQ(item);
	}

	public String dequeue(){
		return obj.removeAtHead();
	}

	public Boolean isEmpty(){
		return obj.isQEmpty();
	}

	public int size(){
		return obj.sizeQ();
	}

}