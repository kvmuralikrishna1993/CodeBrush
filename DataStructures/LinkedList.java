class LinkedList{

	LinkedList(){}

	private Node sfirst = null;
	private Node qfirst = null;
	private Node last = null;
	private int szs = 0;
	private int szq = 0;

	private class Node{
		String item;
		Node next;
	}

	public void addQ(String item) {
		Node oldlast = last;
		last = new Node();
		last.item = item;
		last.next = null;
		if(isQEmpty()) qfirst =last;
		else oldlast.next = last;
		szq++;
	}

	public void addS(String item) {
		Node oldFirst = sfirst;
		sfirst = new Node();
		sfirst.item = item;
		sfirst.next = oldFirst;	
		szs++;
	}

	public String removeAtHead() {
		if(isQEmpty()) return "No Elements Found. Queue is Empty";
		String item = qfirst.item;
		qfirst= qfirst.next;
		if(isQEmpty()) last = null;
		szq--;
		return item;
	}

	public String removeAtTail() {
		if (isSEmpty()) return "No Elements Found. Stack is Empty";
		else{
			String item = sfirst.item;
			sfirst = sfirst.next;
			szs--;
			return item;
		}		
	}

	public int sizeS() {
		return szs;
	}

	public int sizeQ() {
		return szq;
	}

	public Boolean isSEmpty() {
		return sfirst == null;
	}

	public Boolean isQEmpty() {
		return qfirst == null;
	}
	

}
