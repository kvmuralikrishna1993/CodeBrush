import java.util.Queue;
import java.util.LinkedList;

class StackUsingQueue {

	StackUsingQueue(){}

	Queue<Integer> queue = new LinkedList<>();
	Queue<Integer> temp = new LinkedList<>();

	void push(int num) {

		queue.add(num);
	}

	int pop(){

		while(queue.size() > 1) temp.add(queue.poll());
		int num =  queue.poll();
		queue = temp;
		temp = new LinkedList<>();
		return num;
	}

	Boolean isEmpty(){

		return queue.isEmpty();
	}
}