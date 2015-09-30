package edu.cpp.cs240;

/**
 * The array based implementation for queue, making
 * the 0-index as the front always.
 */
public class ArrayBasedIntQueue1 implements IntQueue {

	private int[] data;
	private int rear;

	public ArrayBasedIntQueue1() {
		data = new int[10];
		rear = 0;
	}

	@Override
	public int peek() {
		if (rear > 0) {
			return data[0];
		} else {
			throw new RuntimeException("Can't peek an empty queue.");
		}
	}

	@Override
	public int dequeue() {
		if (rear > 0) {
			int value = data[0];
			// left shifting to remove the element 0
			for(int i = 0; i < rear - 1; i++) {
				data[i] = data[i + 1];
			}
			rear--;
			return value;
		} else {
			throw new RuntimeException("Can't peek an empty queue.");
		}
	}

	@Override
	public void enqueue(int value) {
		if (rear == data.length) {
			int[] data2 = new int[data.length * 2];
			for(int i = 0; i < data.length; i++) {
				data2[i] = data[i];
			}
			data = data2;
		}
		data[rear] = value;
		rear++;
	}

	@Override
	public boolean isEmpty() {
		return rear == 0;
	}

	@Override
	public int size() {
		return rear;
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		for(int i = 0; i < rear; i++) {
			sb.append(data[i]);
			if (i < rear - 1) {
				sb.append(",");
			}
		}
		sb.append("]");
		return sb.toString();
	}
}
