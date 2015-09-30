package edu.cpp.cs240;

public interface IntQueue {

	/** Get the item from the front without removing the item */
	public int peek();

	/** Get the item from the front, removing it from this queue */
	public int dequeue();

	/** Add a new item onto the end of the queue */
	public void enqueue(int value);

	/** Determine whether this queue is empty */
	public boolean isEmpty();

	/** Return the number of items in this queue */
	public int size();
}
