package edu.cpp.cs240;

public class LinkedListBasedPriorityIntQueue implements IntQueue {

	private Node head;
	private int size;

	public LinkedListBasedPriorityIntQueue() {
		head = null;
		size = 0;
	}

	@Override
	public int peek() {
		if (head != null) {
			return head.getValue();
		} else {
			throw new RuntimeException("Can't peek an empty queue.");
		}
	}

	@Override
	public int dequeue() {
		if (head != null) {
			int value = head.getValue();
			head = head.getNext();
			return value;
		} else {
			throw new RuntimeException("Can't peek an empty queue.");
		}
	}

	@Override
	public void enqueue(int value) {
		Node newNode = new Node(value, null);
		if (head == null) {
			head = newNode;
		} else {
			Node cursor = head;
			if (cursor.getValue() < value) {
				newNode.setNext(head);
				head = newNode;
			} else {
				while(cursor.getNext() != null && cursor.getValue() > value) {
					cursor = cursor.getNext();
				}
				newNode.setNext(cursor.getNext());
				cursor.setNext(newNode);
			}
		}
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
