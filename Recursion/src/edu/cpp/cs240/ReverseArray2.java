package edu.cpp.cs240;

import java.util.Arrays;

public class ReverseArray2 {

	public static void reverse(int[] a, int i, int j) {
		if (i >= j) {
			return;
		}
		int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
		reverse(a, i + 1, j - 1);
	}

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		reverse(a, 3, 8);
		System.out.println(Arrays.toString(a));
	}

}
