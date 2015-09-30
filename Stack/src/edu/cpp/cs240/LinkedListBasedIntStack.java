package edu.cpp.cs240;

public class LinkedListBasedIntStack implements IntStack {

	private Node head;
	private int size;

	public LinkedListBasedIntStack() {
		head = null;
		size = 0;
	}

	@Override
	public int peek() {
		if (head != null) {
			return head.getValue();
		} else {
			throw new RuntimeException("Can't peek from an empty stack");
		}
	}

	@Override
	public int pop() {
		if (head != null) {
			int value = head.getValue();
			// remove from the head
			head = head.getNext();
			size--;
			return value;
		} else {
			throw new RuntimeException("Can't peek from an empty stack");
		}
	}

	@Override
	public void push(int value) {
		Node newNode = new Node(value, head);
		head = newNode;
		size++;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public int size() {
		return size;
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		Node cursor = head;
		while(cursor != null) {
			sb.append(cursor.getValue());
			if (cursor.getNext() != null) {
				sb.append(",");
			}
			cursor = cursor.getNext();
		}
		sb.append("]");
		return sb.toString();
	}

}
