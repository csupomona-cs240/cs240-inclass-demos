package edu.cpp.cs240;

import java.util.Arrays;

/**
 * The array based implementation for queue, using
 * the rotational front/rear pointers.
 */
public class ArrayBasedIntQueue2 implements IntQueue {

	private int[] data;
	private int front;
	private int rear;

	public ArrayBasedIntQueue2() {
		data = new int[10];
		front = 0;
		rear = 0;
	}

	@Override
	public boolean isEmpty() {
		return front == rear;
	}

	@Override
	public int size() {
		return ((rear - front + data.length) % data.length);
	}

	@Override
	public int peek(){
		if (isEmpty()) {
			throw new RuntimeException("Can't peek an empty queue.");
		} else {
			return data[front];
		}
	}

	@Override
	public void enqueue(int value) {
		// check if the queue if full
		if ((rear + 1) % data.length == front) {
			// create a new array to increase the capacity
			int[] data2 = new int[data.length * 2];
			int index = 0;
			int i = front;
			while (i != rear) {
				data2[index] = data[i];
				i = (i + 1) % data.length;
				index++;
			}
			front = 0;
			rear = data.length - 1;
			data = data2;
		}
		data[rear] = value;
		rear = (rear + 1) % data.length;
	}

	@Override
	public int dequeue() {
		if (isEmpty()) {
			throw new RuntimeException("Can't dequeue from an empty queue.");
		}
		int value;
		value = data[front];
		front = (front + 1) % data.length;
		return value;
	}

	public String toString() {
		System.out.println("The internal status of the array: " + Arrays.toString(data));
		String res = "[";
		int i = front;
		while(i != rear) {
			res += data[i];
			i = (i + 1) % data.length;
			if (i != rear) {
				res += ",";
			}
		}

		return res + "]";
	}
}
