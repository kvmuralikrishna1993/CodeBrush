class QuickSortOpt implements Sort {

	QuickSortOpt(){}

	static int[] args;

	
	public int[] sort(int[] array){

		args = array;
		return args;
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