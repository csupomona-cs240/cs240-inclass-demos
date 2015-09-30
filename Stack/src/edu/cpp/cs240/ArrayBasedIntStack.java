package edu.cpp.cs240;

public class ArrayBasedIntStack implements IntStack {

	private int[] data;
	private int top;

	public ArrayBasedIntStack() {
		data = new int[10];
		top = 0;
	}

	@Override
	public int peek() {
		if (top == 0) {
			throw new RuntimeException("Cannot peek an empty stack.");
		}
		return data[top];
	}

	@Override
	public int pop() {
		if (top == 0) {
			throw new RuntimeException("Cannot pop element from an empty stack.");
		}
		int value = data[top];
		top--;
		return value;
	}

	@Override
	public void push(int value) {
		if (top >= data.length) {
			increaseArrayCapacity();
		}
		data[top++] = value;
	}

	private void increaseArrayCapacity() {
		int[] newData = new int[data.length * 2];
		for(int i = 0; i < data.length; i++) {
			newData[i] = data[i];
		}
		data = newData;
	}

	@Override
	public boolean isEmpty() {
		return top == 0;
	}

	@Override
	public int size() {
		return top;
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		for(int i = 0; i < top; i++) {
			sb.append(data[i]);
			if (i < top -1) {
				sb.append(",");
			}
		}
		sb.append("]");
		return sb.toString();
	}
}
