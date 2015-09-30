package edu.cpp.cs240;

public class Factorial1 {

	public static long fact(int n) {
		if (n == 0) {
			return 1;
		}
		long res = 1;
		for(int i = 1; i <= n; i++) {
			res = res * i;
		}
		return res;
	}

	public static void main(String[] args) {
		System.out.println(fact(5));
		System.out.println(fact(10));
		System.out.println(fact(20));
	}

}
