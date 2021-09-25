class Armstrong{
	Armstrong(){}

	Boolean check(int num) {

		int len =  getlen(num);
		if(len == 0) return false;
		int sum =  getsum(num, len);
		return sum == num;
	}

	int getlen(int num) {
		
		int len = 0;
		if(num <= 0) return 0;
		while(num != 0){
			num = num/10;
			len++;
		}
		return len;
	}

	int getsum(int num, int len) {
		int sum= 0;
		while(num != 0) {
			int rem =  num%10;
			num = num/10;
			sum +=  getpow(rem, len);
		}
		return sum;
	}

	int getpow(int rem, int len) {

		int pow = rem;
		for (int i = 1; i<=len-1;i++ ) {
			pow *= rem;
		}
		return pow;
	}
}