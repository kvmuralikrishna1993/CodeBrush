class CheckDS{
	
	CheckDS(){}

	public static void main(String[] args) {
		Stack ss = new Stack();
		ss.push(1);
		ss.push(2);
		System.out.println(ss.pop());
		System.out.println(ss.pop());

		Queue qq = new Queue();
		qq.enqueue(1);
		qq.enqueue(2);
		System.out.println(qq.dequeue());
		System.out.println(qq.dequeue());
	}
}

