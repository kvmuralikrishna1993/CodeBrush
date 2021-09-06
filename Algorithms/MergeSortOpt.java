//Optimised Merge Sort
//For small arrays use Insertion Sort
//Terminate condition when mid is less than mid+1 (which means already sorted)
//switch roles to save extra space.
class MergeSortOpt implements Sort{

	MergeSortOpt(){}

	int[] args;
	
	public int[] sort(int[] args){
		int N = args.length;
		int[] aux = new int[N];
		sort(args, aux, 0, N-1);
		return args;
	}

	//recursively sorting the array: DIVIDE AND CONQUER.
	public void sort(int[] args, int[] aux, int lo, int hi ) {
		if(hi<=lo+6){ //for 7 elements use insertion
			insertionSort(args, lo, hi); return;
		} 
		int mid = lo +(hi-lo)/2;
		sort(aux,args,lo,mid); //switched the args and aux
		sort(aux,args,mid+1,hi); //switched the args and aux
		if(!isLess(args[mid+1], args[mid])) return; //compare mid+1, mid and terminate
		merge(args,aux,lo,mid,hi);
	}

	//merging two sorted merge arrays.
	public void merge(int[] args, int[] aux, int lo, int mid, int hi) {
		// for (int k=lo;k<hi;k++) aux[k] =args[k]; //copy // removed copy
		int i = lo;
		int j = mid+1;
		for (int k =lo;k<=hi;k++ ) {
			if (i > mid) aux[k] = args[j++];
			else if (j > hi) aux[k] = args[i++];
			else if (isLess(args[j], args[i])) aux[k] = args[j++];
			else aux[k] = args[i++];
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

	public void insertionSort(int[] args, int lo, int hi) {
		for (int i =lo;i<=hi;i++) {
			for (int j=i;j>0;j-- ) {
				if(isLess(args[j],args[j-1])){
					int temp = args[j-1];
					args[j-1] =args[j];
					args[j] = temp; 
				}
			}
		}
	}

}