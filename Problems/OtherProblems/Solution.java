class Solution{

	Solution(){}

	public static void main(String[] args) {

								/*EACH BLOCK REPRESENTS EACH PROBELM*/
		/*-------------------------------------------------------------------------------------------*/
		//Check armstrong number or not.
		Armstrong armstrong = new Armstrong();

		if (armstrong.check(153)) System.out.println("Yes");
		else System.out.println("No");
		if (armstrong.check(1534)) System.out.println("Yes");
		else System.out.println("No");

		/*-------------------------------------------------------------------------------------------*/
		//Check the String is Palindrome or not
		PalindromeSt palindromeString = new PalindromeSt();

		if (palindromeString.check("aba")) System.out.println("Yes");
		else System.out.println("No");

		/*-------------------------------------------------------------------------------------------*/
		//Check the Number is Palindrome or not 
		PalindromeNum palindromeNumber = new PalindromeNum();

		if (palindromeNumber.checkS(151)) System.out.println("Yes"); // <- (CONVERTING INTEGER TO STRING)
		else System.out.println("No");

		if (palindromeNumber.check(151)) System.out.println("Yes");	 // <- (NOT CONVERTING TO STRING)
		else System.out.println("No");

		/*-------------------------------------------------------------------------------------------*/
		//First repeating element in an array of integers.
		int[] arr = {10,4,5,3,5,2,1};
		FirstRepeat firstrepeat = new FirstRepeat();

		System.out.println(firstrepeat.getelement(arr)); //USING HASHMAP
		System.out.println(firstrepeat.getelement(arr, arr.length)); //USING ARRAY

		/*-------------------------------------------------------------------------------------------*/
		//Queue Using Stack
		QueueUsingStack queue =  new QueueUsingStack();
		queue.enqueue(1);queue.enqueue(2);queue.enqueue(3);

		while(!queue.isEmpty()) System.out.print(queue.dequeue());
		System.out.println();

		/*-------------------------------------------------------------------------------------------*/
		//Stack Using Queue
		StackUsingQueue stack = new StackUsingQueue();
		stack.push(1);stack.push(2);stack.push(3);

		while(!stack.isEmpty()) System.out.print(stack.pop());
		System.out.println();

		/*-------------------------------------------------------------------------------------------*/
		//Largest Continous Subarray

		LSCsubarray sa = new LSCsubarray();
		int[] ar = {-2,-3,4,-1,-2,1,5,-3,1};
		System.out.println(sa.maxSum(ar));

		/*-------------------------------------------------------------------------------------------*/
		//Maximum of subarray having sum less than or equal to given sum.[non-negative numbers]
	
		MaxSubArray msa = new MaxSubArray();
		System.out.println(msa.maxSubSum(arr, 15));

		/*-------------------------------------------------------------------------------------------*
	}
	
}