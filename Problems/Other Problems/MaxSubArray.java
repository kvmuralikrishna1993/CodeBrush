//Maximum of subarray having sum less than or equal to given sum.[non-negative numbers]

class MaxSubArray{

	MaxSubArray(){}

	int maxSubSum(int[] a, int sum){

		int maxSubSum = 0;
		int curSum = 0;
		int startIndex = 0;

		for (int i =0; i< a.length;i++) {

			if(curSum <= sum) maxSubSum = Math.max(maxSubSum,curSum);

			while(curSum > sum && startIndex < i){
				curSum -= a[startIndex];
				startIndex++; 
			}
			
			curSum += a[i]; 
		}

		if(curSum <= sum) maxSubSum = Math.max(maxSubSum,curSum);

		return maxSubSum;
	}
}