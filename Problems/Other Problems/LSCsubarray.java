//Largest Sum Continguous Subarray [KADANE's ALGORITHM]

class LSCsubarray {

	LSCsubarray(){}

	int maxSum(int[] a) {

		int maxSum = Integer.MIN_VALUE;
		int temp = 0;
		for (int i =0;i<a.length;i++) {
			temp += a[i];
			if(temp > maxSum) maxSum = temp;
			if(temp < 0) temp =0; 
		}
		return maxSum;
	}

}