import java.util.Arrays;

class Algorithms {

	Algorithms(){}

	public static void print(int[] args){
		for (int i=0;i<args.length;i++ ) System.out.print(args[i]);
		System.out.println();
	}

	public static void main(String[] args) {

		Sort obj1 = new SelectionSort();
		Sort obj2 = new InsertionSort();
		Sort obj3 = new ShellSort();


		//checking sorted or not
		print(obj1.sort(new int[] {3,4,1,5,8,9,2,7,6,0}));
		print(obj2.sort(new int[] {3,4,1,5,8,9,2,7,6,0}));
		print(obj3.sort(new int[] {3,4,1,5,8,9,2,7,6,0}));
	}


}