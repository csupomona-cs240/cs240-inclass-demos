package edu.cpp.cs240;

public class IntQueueTest {

	public static void main(String[] args) {
		//IntQueue queue = new ArrayBasedIntQueue1();
		IntQueue queue = new ArrayBasedIntQueue2();
		//IntQueue queue = new LinkedListBasedIntQueue();
		queue.enqueue(5);
		queue.enqueue(6);
		queue.enqueue(7);
		queue.enqueue(8);
		queue.enqueue(9);

		System.out.println(queue);
		System.out.println(queue.size());
		System.out.println(queue.isEmpty());

		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.peek());
		System.out.println(queue.peek());
		System.out.println(queue.peek());

		System.out.println(queue);
		System.out.println(queue.size());
		System.out.println(queue.isEmpty());

		queue.enqueue(7);
		queue.enqueue(8);
		queue.enqueue(9);
		queue.enqueue(7);
		queue.enqueue(8);
		queue.enqueue(9);
		queue.enqueue(10);
		queue.enqueue(11);
		queue.enqueue(12);

		System.out.println(queue);
		System.out.println(queue.size());
		System.out.println(queue.isEmpty());

		System.out.println(queue);
		System.out.println(queue.size());
		System.out.println(queue.isEmpty());
	}

}
