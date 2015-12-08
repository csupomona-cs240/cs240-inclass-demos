package edu.cpp.cs240;

public class Factorial3 {

	public static int n;

	// Demonstrate the usage of global variable in recursion - not recommended
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
