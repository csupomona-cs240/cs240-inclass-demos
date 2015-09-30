package edu.cpp.cs240;

import java.util.Arrays;

public class ArrayReversal {

	public static void main(String[] args) {
		int[] data = {23, 45, -1, -5, 2, 56, -9, 100, -200};
		System.out.println(Arrays.toString(data));

		reverseArray(data);
		System.out.println(Arrays.toString(data));
	}

	public static void reverseArray(int[] data) {

		for(int i = 0; i < data.length / 2; i++) {
			int temp = data[i];
			data[i] = data[data.length - i - 1];
			data[data.length - i - 1] = temp;

			// a different approach to swap values without the 3rd temp variable
//			data[i] = data[data.length - i - 1] + data[i];
//			data[data.length - i - 1] = data[i] - data[data.length - i - 1];
//			data[i] = data[i] - data[data.length - i - 1];
		}
	}

}
