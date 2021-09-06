class MergeSort implements Sort{

	MergeSort(){}

	int[] args;
	
	public int[] sort(int[] array){
		args = array;
		int N = args.length;
		int[] aux = new int[N];
		sort(args, aux, 0, N-1);
		return args;
	}

	//recursively sorting the array: DIVIDE AND CONQUER.
	public void sort(int[] args, int[] aux, int lo, int hi ) {
		if(hi<=lo) return;
		int mid = lo +(hi-lo)/2;
		sort(args,aux,lo,mid);
		sort(args,aux,mid+1,hi);
		merge(args,aux,lo,mid,hi);
	}

	//merging two sorted merge arrays.
	public void merge(int[] args, int[] aux, int lo, int mid, int hi) {
		for (int k=lo;k<=hi;k++) aux[k] =args[k]; //copy
		int i = lo;
		int j = mid+1;
		for (int k =lo;k<=hi;k++ ) {
			if (i > mid) args[k] = aux[j++];
			else if (j > hi) args[k] = aux[i++];
			else if (isLess(aux[j], aux[i])) args[k] = aux[j++];
			else args[k] = aux[i++];
		}
	} 

	// Checks a is less than b
	public Boolean isLess(int a , int b) {
		return a<b;
	}

	// i, min are indexes
	public void swap(int i, int min){
		int temp =args[min];
		args[min] = args[i];
		args[i] = temp;
	}

}