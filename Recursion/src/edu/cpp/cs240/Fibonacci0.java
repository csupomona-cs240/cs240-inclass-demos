package edu.cpp.cs240;

public class Fibonacci0 {

	public static int fib(int n) {
		if (n == 1 || n == 2) {
			return 1;
		}
		int p1 = 1;
		int p2 = 1;
		int sum = 0;
		for(int i = 0; i < n - 2; i++) {
			sum = p1 + p2;
			p1 = p2;
			p2 = sum;
		}
		return sum;

	}
	public static void main(String[] args) {
		System.out.println(fib(10));
	}

}
