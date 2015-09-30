package edu.cpp.cs240;

public class Factorial2 {

	public static int n;

	public static long fact() {
		if (n == 0) {
			return 1;
		} else {
			n--;
			return n * fact();
		}
	}

	public static void main(String[] args) {
		n = 5;
		System.out.println(fact());
//		System.out.println(fact(10));
//		System.out.println(fact(20));
	}
}
