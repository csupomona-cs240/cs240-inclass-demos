package edu.cpp.cs240;

import java.util.Arrays;

public class ArraysTest {

	public static void main(String[] args) {
		int[] scores = {4, 5, 6, 1, 2, 3};
		System.out.println(scores);

		// use Arrays toString() to format the array print out reesult
		System.out.println(Arrays.toString(scores));

		// use Arrays sort() to sort the elements in the array
		Arrays.sort(scores);
		System.out.println(Arrays.toString(scores));

		// use Arrays equal() to compare the two arrays
		int[] scores2 = {4, 5, 6, 1, 2, 3};
		int[] scores3 = {4, 5, 6, 1, 2, 3};
		System.out.println(Arrays.equals(scores, scores2));
		System.out.println(Arrays.equals(scores2, scores3));
	}

}
