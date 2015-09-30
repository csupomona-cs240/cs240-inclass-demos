package edu.cpp.cs240;

import java.util.Arrays;

public class ReverseArray1 {

	public static void reverse(int[] a, int i, int j) {
		int size = j - i + 1;
		for(int k = 0; k < size / 2; k++) {
			int tmp = a[k + i];
			a[k + i] = a[j - k];
			a[j - k] = tmp;
		}
	}

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		reverse(a, 3, 8);
		System.out.println(Arrays.toString(a));
	}

}
