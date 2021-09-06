class BottomUpMergeSort implements Sort{

	BottomUpMergeSort(){}

	int[] args;

	public int[] sort(int[] array){
		int N = array.length;
		args = array;
		int[] aux = new int[N];
		for (int sz = 1; sz < N; sz = sz+sz){
			for (int lo = 0; lo < N-sz; lo += sz+sz){
				merge(args, aux, lo, lo+sz-1, Math.min(lo+sz+sz-1, N-1));
			}
  		}
		return args;
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