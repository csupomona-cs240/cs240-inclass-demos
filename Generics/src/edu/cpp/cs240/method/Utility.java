package edu.cpp.cs240.method;


public class Utility {

	public static <T> T getMidpoint(T[] a) {
		if (a.length == 0)
			return null;
		else
			return a[a.length/2];
	}

	public static <T> T getFirst(T[] a) {
		if (a.length == 0)
			return null;
		else
			return a[0];
	}
}