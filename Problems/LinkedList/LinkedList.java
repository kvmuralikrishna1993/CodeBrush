class LinkedList{

	LinkedList(){}

	Node first,last;
	int size =0;

	Node getFirst(){
		return first;
	}

	Node getLast(){
		return last;
	}

	void firstAdd(int val){
		Node old = first;
		first = new Node(val);
		if(size() == 0) last = first;
		first.next =  old;
		size++;
	}

	int firstRemove(){
		if(size == 0) return -1;
		int val = first.val;
		first = first.next;
		size--;
		return val;
	}

	void lastAdd(int val){
		Node old = last;
		last = new Node(val);
		if(size() == 0) first = last;
		old.next = last;
		size++;
	}

	int lastRemove(){
		if(size == 0) return -1;
		int val =  last.val;
		Node temp = first;
		while(temp.next.next != null) temp = temp.next;
		last = temp;
		last.next = null;
		size--;
		return val;
	}

	void add(int val, int index){
		if(size == 0) return;
		if(index == 0) firstAdd(val);
		Node left = first;
		for (int i=0;i< index-1;i++) {
			left = left.next;
		}
		Node right = left.next;
		left.next  = new Node(val);
		left.next.next = right;
		size++;
	}

	int remove(int index){
		if(size == 0) return -1;
		if(index == 0) firstRemove();
		Node left = first;
		for (int i=0;i< index-1;i++) {
			left = left.next;
		}
		int val = left.next.val;
		left.next = left.next.next;
		size--;
		return val;
	}

	int size(){
		return size;
	}

	Boolean contains(int val){
		Node temp = first;
		while(temp.next != null){
			if(temp.val == val) return true;
			temp = temp.next; 
		}
		return false;
	}

	Boolean isEmpty(){
		return size == 0;
	}

	void print(){
		if(size == 0) return;
		Node temp = first;
		while(temp.next != null){
			System.out.print(temp.val +" "+"<- ");
			temp = temp.next;
		}
		System.out.print(temp.val);
		System.out.println();
	}

}