//Binary Serach is used to search value in sorted array with logN complexity.

public class BinarySearch {

	BinarySearch(){}

	public static void main(String[] args) {
		int[] sortedArray = {6,13,13,25,33,43,51,53,64,72,78,89,95,97};
		int key = 51;
		int low = 0;
		int high = sortedArray.length-1;
		while(low<=high){
			int mid = low +(high - low)/2;
			if(key < sortedArray[mid]) high =mid-1;
			else if(key > sortedArray[mid]) low = mid+1;
			else System.out.println("located "+sortedArray[mid] +" at index: "+ mid); break;
		}
	}

}