class PalindromeSt{

	PalindromeSt(){}

	Boolean check(String st){
		
		int len = st.length();
		for (int i =0; i< len/2 ; i++) {
			if (st.charAt(i) != st.charAt(len-1-i)) return false;
		}
		return true;
	}
}