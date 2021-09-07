import java.util.Random;

class QuickSort implements Sort {

	QuickSort(){}

	int[] args;

	//shuffles the array
	public int[] shuffle(int[] a) {
		long seed = System.currentTimeMillis();
    	Random random = new Random(seed);
		int n = a.length;
        for (int i = 0; i < n; i++) {
            int r = i + random.nextInt(n-i);
            int temp = a[i];
            a[i] = a[r];
            a[r] = temp;
        }
        return a;
	}
	
	public int[] sort(int[] array){
		array = shuffle(array);
		sort(array, 0, array.length-1);
		return args;
	}

	public void sort(int[] array, int lo, int hi){
		if(hi <= lo) return;
		int j = partition(array,lo,hi);
		sort(array,lo,j);
		sort(array,j+1,hi);
	}

	public int partition(int[] a, int lo, int hi){
		args = a;
		int i = lo;
		int j= hi+1;
		while(true){
			while(isLess(args[++i],args[lo])) if(i==hi) break;
			while(isLess(args[lo],args[--j])) if(j==lo) break;
			if(i>=j) break;
			swap(i,j);
		}
		swap(lo,j);
		return j;
	}


	// Checks a is less than
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