class ShellSort implements Sort{

	int[] args;

	ShellSort(){}

	// Returns Sorted array

	public int[] sort(int[] array){

		int N = array.length;
		args = array;

		int h = 1;
		while(h< N/3) h = 3*h+1;

		while(h>=1){
			for (int i =0;i<N;i++ ) {
				for (int j = i; j >= h && isLess(args[j],args[j-h]); j=j-h) swap(j,j-h);
			}
			h= h/3;
		}
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