package edu.cpp.cs240.method;

public class Test {

	public static void main(String[] args) {
		Integer[] a = {1, 2, 3};
		Double[] b = {1.2, 4.5, 3.3};

		Utility.<Integer>getFirst(a);
		Utility.getFirst(b);
	}

}
