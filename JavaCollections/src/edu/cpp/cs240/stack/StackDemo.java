package edu.cpp.cs240.stack;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		stack.push("a");
		stack.push("b");
		stack.push("c");
		System.out.println(stack);

		System.out.println(stack.peek());
		System.out.println(stack.peek());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack);
	}
}
