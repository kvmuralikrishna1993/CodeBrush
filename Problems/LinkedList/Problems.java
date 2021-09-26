import java.util.HashSet;
import java.util.Set;
import java.util.Stack;
import java.util.Arrays;

class Problems {

	Problems(){}
	
	public static void main(String[] args) {
		
		LinkedList linkedlist =  new LinkedList();
		linkedlist.firstAdd(4);
		linkedlist.firstAdd(3);
		linkedlist.firstAdd(2);
		linkedlist.firstAdd(1);

		System.out.print("Linked list: ");
		linkedlist.print();


		System.out.println("middle element : "+getMid(linkedlist)); //even size

		linkedlist.firstAdd(0);
		linkedlist.print();
		System.out.println("middle element : "+getMid(linkedlist)); //odd size


		if(contains(linkedlist, 2)) System.out.println("Yes");

		System.out.println("Intersect : " + iNode(linkedlist));

		LinkedList ll =  new LinkedList();
		ll.firstAdd(1);
		ll.firstAdd(0);
		ll.firstAdd(2);
		ll.firstAdd(0);
		ll.firstAdd(1);
		ll.print();


		if(isPalindromeUsingStack(ll)) System.out.println("Yes");

		// if(isPalindrome(ll)) System.out.println("Yes");

		// System.out.print("Reverse list : "); reverseList(ll);

		sort(ll);
		ll.print();

		System.out.println("ODD SUM : " + oddSum(ll)); 
		System.out.println("EVEN SUM : " + evenSum(ll));
 
		removeDuplicated(ll);
		
		//Creating linked list with cycle.
		Node root=  new Node(1);
		root.next =  new Node(2);
		root.next.next =  new Node(3);
		root.next.next.next = new Node(4);
		root.next.next.next.next =root;
		if(islooped(root)) System.out.println("Is looped ..");


		ll.print();
		linkedlist.print();
		addTwo(ll, linkedlist);

	}

	static int getMid(LinkedList linkedlist){

		Node first = linkedlist.getFirst();
		double size = size(first);
		for(int i = 0; i < Math.ceil(size/2)-1; i++){
			first  =  first.next;
		}
		return first.val;
	}


	//using without extra space
	static Boolean isPalindrome(LinkedList linkedlist){
		Node first = linkedlist.getFirst();

		Node fast = first;
		Node slow = first;
		Node reversefirsthalf = null; 

		while(fast != null & fast.next != null){
			fast = fast.next.next;
			Node temp = slow; // <- store in temp to create reverse list for first half
			slow = slow.next;
			temp.next = reversefirsthalf;
			reversefirsthalf =  temp; // <- creating new list for first half

		}

		if(fast != null) slow = slow.next; //handling odd case

		while(slow != null){
			if(slow.val != reversefirsthalf.val) return false;
			reversefirsthalf = reversefirsthalf.next;
			slow = slow.next;
		}

		return true;
	}

	//using stack
	static Boolean isPalindromeUsingStack(LinkedList linkedlist){

		Node first = linkedlist.getFirst();

		Stack<Integer> stack  = new Stack<>();
		Node temp = first;

		while(temp != null){
			stack.add(temp.val);
			temp = temp.next;
		}

		temp = first;

		while(!stack.isEmpty()) {
			if(temp.val != stack.pop()) return false;
			temp = temp.next;
		}		
		return true;
	}

	// contains using recursion
	static Boolean contains(LinkedList linkedlist , int val){
		Node first = linkedlist.getFirst();
		return contains(first, val);
	}

	static Boolean contains(Node node, int val){
		if(node == null) return false;
		if(node.val == val) return true;
		else return contains(node.next, val);
	}

	//intersection Node
	static int iNode(LinkedList linkedlist){
		Node first = linkedlist.getFirst();
		Node second =  new Node(7);
		second.next = first.next.next; //creating a intersection :P
		return findIntersect(first, second);
	}

	static int findIntersect(Node first, Node second){
		Set<Node> set = new HashSet<>();

		while(first != null) { 
			set.add(first);
			first =  first.next;
		}

		while(second != null){	
			if(set.contains(second)) return second.val;
			second = second.next;
		}

		return -1;
	}

	//get size with recursive
	static int size(LinkedList linkedlist){

		Node first = linkedlist.getFirst();
		return size(first);
	}

	static int size(Node node){
		if(node == null)  return 0;
		else return 1 + size(node.next);
	}

	//reverse a linked list
	static void reverseList(LinkedList linkedlist){

		Node first = linkedlist.getFirst();
		Node prev = null;
		while(first != null){
			Node temp = first;
			first = first.next;
			temp.next = prev;
			prev =  temp;
		}
		print(prev);
	}

	//contains only : 0,1,2
	static void sort(LinkedList linkedlist){

		int[] a = {0,0,0};

		Node first =  linkedlist.getFirst();
		Node temp = first;
		while(temp !=  null){
			a[temp.val]++;
			temp = temp.next;
		}
		// System.out.println(Arrays.toString(a));
		int i =0;
		temp = first;
		while(temp != null){
			if(a[i] == 0) i++;
			else {
				temp.val = i;
				a[i]--;
				temp = temp.next;
			}
		}
		
	}

	//returns the sum of odd nodes
	static int oddSum(LinkedList linkedlist){

		Node first =  linkedlist.getFirst();
		Node temp  = first;
		int count  = 0;
		int sum =0;
		while(temp != null){
			if(count %2 == 1){
			}else {
				sum+= temp.val;
			}
			temp =  temp.next;
			count++;
		}
		return sum;
	}

	//returns the sum of even nodes
	static int evenSum(LinkedList linkedlist){

		Node first =  linkedlist.getFirst();
		Node temp  = first;
		int count  = 0;
		int sum =0;
		while(temp != null){
			if(count %2 == 1){
				sum+= temp.val;
			}else {

			}
			temp =  temp.next;
			count++;
		}
		return sum;
	}

	//adds two linked list where each list represent a number.
	static void addTwo(LinkedList la, LinkedList lb){
		Node l1 = la.getFirst();
		Node l2 = lb.getFirst();

		Node first = new Node(0);
		Node result = first;

		int carry = 0;

		while(l1 != null || l2 != null || carry != 0) {
			
			int sum =0;
			
			if(l1 != null){
				sum += l1.val;
				l1 =l1.next;
			}

			if(l2 != null){
				sum += l2.val;
				l2 = l2.next;
			}

			sum = sum+ carry;
			carry = sum/10;
			// System.out.println(sum%10);
			result.next = new Node(sum%10);
			result =result.next;

		}
		first = first.next; //-> removing zero
		print(first);

	}

	//removes duplicates from sorted linked list.
	static void removeDuplicated(LinkedList linkedlist){
		Node first = linkedlist.getFirst();
		Node temp = first;
		while(temp != null  & temp.next != null){
			if(temp.val == temp.next.val) temp.next = temp.next.next;
			else temp = temp.next;
		}
	}

	//prints list start from root.
	static void print(Node first){
		if(first == null) return;
		Node temp = first;
		while(temp.next != null){
			System.out.print(temp.val +" "+"<- ");
			temp = temp.next;
		}
		System.out.print(temp.val);
		System.out.println();
	}

	// checks whether cycle is there in linked list.
	static Boolean islooped(Node first){
		Node temp = first;
		HashSet<Node> set = new HashSet<>();
		while( temp != null){
			if(set.contains(temp)) return true;
			else set.add(temp);
			temp = temp.next;
		}
		return false;
	}



}