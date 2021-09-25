import java.util.HashSet;
import java.util.Arrays;

//first repeating element in array; 

class FirstRepeat {

	FirstRepeat(){}

	//USING HASHSET
	int getelement(int[] a){

		HashSet<Integer> hset =  new HashSet<>();
		
		for (int i=0;i< a.length;i++ ) {
			if(hset.contains(a[i])) return a[i];
			else hset.add(a[i]);
		}

		return -1;

	}

	//USING ARRAY
	int getelement(int[] a, int len) {

		int max = getmax(a, len);
		int[] newa = new int[max+1];

		for (int i=0;i<len;i++ ) {
			int index = a[i];
			if(newa[index] == 1) return index;
			else newa[index]++;
			// System.out.println(Arrays.toString(newa));
		}

		return -1;

	}

	int getmax(int[] a, int len){

		int max = Integer.MIN_VALUE;

		for (int i=0;i< len; i++) {
			if(a[i] > max) max = a[i];
		}
		return max;
	}

}