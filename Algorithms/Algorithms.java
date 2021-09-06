import java.util.Arrays;

class Algorithms {

	Algorithms(){}

	public static void print(int[] args){
		for (int i=0;i<args.length;i++ ) System.out.print(args[i]);
		System.out.println();
	}

	public static void main(String[] args) {

		int[] rA = {3,4,1,5,8,9,2,7,6,0};

		Sort obj1 = new SelectionSort();
		Sort obj2 = new InsertionSort();
		Sort obj3 = new ShellSort();
		Sort obj4 = new MergeSort();
		Sort obj5 = new MergeSortOpt();
		Sort obj6 = new BottomUpMergeSort();


		//checking sorted or not
		print(obj1.sort(rA));
		print(obj2.sort(rA));
		print(obj3.sort(rA));
		print(obj4.sort(rA));
		print(obj5.sort(rA));
		print(obj6.sort(rA));
	}


}