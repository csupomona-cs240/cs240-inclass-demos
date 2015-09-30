package edu.cpp.cs240;

public class IntHashEntry {

	private int key;
	private int value;

	private IntHashEntry next;

	public IntHashEntry(int key, int value) {
		this.key = key;
		this.value = value;
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public IntHashEntry getNext() {
		return next;
	}

	public void setNext(IntHashEntry next) {
		this.next = next;
	}
}
