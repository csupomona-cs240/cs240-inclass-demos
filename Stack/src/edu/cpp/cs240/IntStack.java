package edu.cpp.cs240;

public interface IntStack {

	/** Get the top item of this stack without removing the item */
	public int peek();

	/** Get the top item, removing it from this stack */
	public int pop();

	/** Push a new item onto this stack. The new item may be the null reference. */
	public void push(int value);

	/** Determine whether this stack is empty. */
	public boolean isEmpty();

	/** Return the number of items in this stack. */
	public int size();

}
