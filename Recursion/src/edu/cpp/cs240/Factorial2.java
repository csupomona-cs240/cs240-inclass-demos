package edu.cpp.cs240;

public class Factorial2 {

	public static long fact(int n) {
		if (n == 0) {
			return 1;
		} else {
			return n * fact(n - 1);
		}
	}

	public static void main(String[] args) {
		System.out.println(fact(10));
		System.out.println(fact(20));
	}
}
