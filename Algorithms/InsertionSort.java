class InsertionSort implements Sort{

	int[] args;

	InsertionSort(){}
	
	public int[] sort(int[] array){

		args = array;
		for(int i =0; i< args.length; i++){
			for (int j = i; j>0; j--)
				if(isLess(args[j],args[j-1])){ 
					swap(j,j-1); 
				}
				else break;
		}
		return args;

	}


	// Checks a is less than b

	public Boolean isLess(int a , int b) {

		return a<b;

	}


	// i, j are indexes

	public void swap(int i, int min){

		int temp =args[min];
		args[min] = args[i];
		args[i] = temp;

	}
}