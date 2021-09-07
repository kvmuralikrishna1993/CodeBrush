import java.util.Random;

//optimized version
class QuickSortOpt implements Sort {

	QuickSortOpt(){}

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
		if(hi <= lo+7){
			insertionSort(array,lo,hi); //use insertion when 10 elements are there to sort
			return;
		}
		int m = middleOfThree(lo, lo+(hi-lo)/2,hi); //use median for pivot element[just swap]
		int temp = array[lo];
		array[lo] = array[m];
		array[m] = temp;
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

	public int middleOfThree(int a, int b, int c){
        if ((a < b && b < c) || (c < b && b < a)) return b;
        else if ((b < a && a < c) || (c < a && a < b)) return a;
        else return c;
    }


}