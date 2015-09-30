package edu.cpp.cs240;

public class IntStackTest {

	public static void main(String[] args) {
		//IntStack stack = new ArrayBasedIntStack();
		IntStack stack = new LinkedListBasedIntStack();

		System.out.println(stack.size());
		System.out.println(stack);
		System.out.println(stack.isEmpty());

		stack.push(4);
		stack.push(6);
		stack.push(2);
		stack.push(1);
		stack.push(1);
		stack.push(5);

		System.out.println(stack.size());
		System.out.println(stack);
		System.out.println(stack.isEmpty());

		stack.push(4);
		stack.push(6);
		stack.push(2);
		stack.push(1);
		stack.push(1);
		stack.push(2);
		stack.push(1);
		stack.push(1);
		stack.push(5);

		System.out.println(stack.size());
		System.out.println(stack);
		System.out.println(stack.isEmpty());

		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());

		System.out.println(stack.size());
		System.out.println(stack);
		System.out.println(stack.isEmpty());

		System.out.println(stack.peek());
		System.out.println(stack.peek());
		System.out.println(stack.peek());
		System.out.println(stack.peek());

		System.out.println(stack.size());
		System.out.println(stack);
		System.out.println(stack.isEmpty());
	}

}
