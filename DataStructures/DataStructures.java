public class DataStructures {
	DataStructures(){}
	public static void main(String[] args) {

		Stack obj1 = new Stack();
		Queue obj2 = new Queue();

		obj1.push("a");
		obj1.push("b");
		obj1.push("c");

		int sz = obj1.size();

		for (int i =0;i< sz;i++ ) System.out.println(obj1.pop());
		if (obj1.isEmpty()) System.out.println("My Stack is Empty");

	// ---------------------------- //
		
		obj2.enqueue("e");
		obj2.enqueue("f");
		obj2.enqueue("g");


		sz = obj2.size();

		for (int i =0;i< sz;i++ ) System.out.println(obj2.dequeue());
		if (obj2.isEmpty()) System.out.println("My Queue is Empty");


	}
}