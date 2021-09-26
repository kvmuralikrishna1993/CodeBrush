class Solution{

	Solution(){}

	public static void main(String[] args) {
		
		LinkedList properties = new LinkedList();

		// 2 <- 1

		properties.firstAdd(1);
		properties.firstAdd(2);
		properties.print();
		
		// 1 <- 2 <- 4 <- 3

		properties.lastAdd(4);
		properties.lastAdd(3);
		properties.print();

		// 2 <- 5 <- 1 <- 4 <- 3

		properties.add(5, 1);
		properties.print();		

		// 2 <- 5 <- 1 <- 6 <- 4 <- 3

		properties.add(6, 3);
		properties.print();

		// 2 <- 5 <- 1 <- 4 <- 3

		properties.remove(3);
		properties.print();		

		// 2 <- 5 <- 1 <- 4

		properties.lastRemove();
		properties.print();

		// 5 <- 1 <- 4
		
		properties.firstRemove();
		properties.print();

		//3
		System.out.println(properties.size());

		// Yes
		if(properties.contains(5)) System.out.println("Yes");;

		// No
		if(!properties.isEmpty()) System.out.println("No");

	}
}