class SelectionSort implements Sort{

	int[] args;
	
	SelectionSort(){}

	public int[] sort(int[] array){
		args = array;
		for(int i =0; i< args.length; i++){
			int min = i;
			for (int j = i+1; j<args.length; j++ ) if(isLess(args[j],args[min])) min = j;
			swap(i,min);
		}
		return args;
	}

	// Checks a is less than b
	public Boolean isLess(int a , int b) {
		return a<b;
	}

	// i, min are indexes
	public void swap(int i, int min){
		int temp =args[i];
		args[i] = args[min];
		args[min] = temp;
	}
}