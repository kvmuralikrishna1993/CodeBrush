class Stack{
	Stack(){}

	LinkedList obj = new LinkedList();

	public void push(String item){
		obj.addS(item);
	}

	public String pop(){
		return obj.removeAtTail();
	}

	public Boolean isEmpty(){
		return obj.isSEmpty();
	}

	public int size(){
		return obj.sizeS();
	}

}