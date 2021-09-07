class PriorityQueue {

	private int[] pq;
	private int sz; 
	
	PriorityQueue(){}

	public void capacity(int n){
		pq = new int[n];
	}

	public boolean isEmpty(){
		return sz == 0;
	}

	public void insert(int a){
		pq[sz++] = a;
	}

	public int delMax(){
		int max = 0;
		for (int i =0;i<sz;i++ ) {
			if(isLess(max,i)) max = i;
		}
		swap(max,sz-1);
		return pq[--sz];

	}

	public void swap(int i, int j){
		int item = pq[i];
		pq[i] = pq[j];
		pq[j] = item;
	}

	public boolean isLess(int i, int j){
		return pq[i]<pq[j];
	}



}