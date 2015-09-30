package edu.cpp.cs240;

public class Fibonacci1 {

	public static int fib(int n) {
		if (n == 2 || n == 1) {
			return 1;
		} else {
			return fib(n - 1) + fib(n - 2);
		}
	}
	public static void main(String[] args) {
		System.out.println(fib(10));
	}

}
