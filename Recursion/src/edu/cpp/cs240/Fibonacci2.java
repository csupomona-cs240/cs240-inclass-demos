package edu.cpp.cs240;

public class Fibonacci2 {

	public static int fib(int term, int val, int prev) {
		if(term == 0) return prev;
		if(term == 1) return val;
		return fib(term - 1, val + prev, val);
	}

	public static void main(String[] args) {
		System.out.println(fib(10, 1, 0));
	}

}
