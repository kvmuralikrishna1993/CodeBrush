import java.util.Arrays;

class PalindromeNum {

	PalindromeNum(){}


	//Converting to String
	Boolean checkS(int num){
		
		PalindromeSt palindromeString = new PalindromeSt();
		return palindromeString.check(num+"");
	}


	// Not Converting to String
	Boolean check(int num){

		if(num <= 10) return false;
		int len = getlen(num);
		int[] a = getArray(num, len);
		for (int i =0;i<len; i++ ) {
			if (a[i] != a[len-1-i]) return false;
		}
		return true;
	}

	int getlen(int num){

		int len =0;
		while(num != 0){
			num =num/10;
			len++;
		}
		return len;
	}

	int[] getArray(int num, int len){

		int[] a =  new int[len];
		for (int i=0;i<len;i++) {
			a[i] = num%10;
			num = num/10; 
		}
		return a;
	}
}