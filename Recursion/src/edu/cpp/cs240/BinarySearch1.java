package edu.cpp.cs240;


public class BinarySearch1 {

	public static int binarySearch(int[] a, int n) {
		int i = 0;
		int j = a.length - 1;
		while(i <= j) {
			int m = (i + j) / 2;
			if (a[m] == n) {
				return m;
			}
			if (a[m] < n) {
				i = m + 1;
			} else {
				j = m - 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,7,7,8,9,10,11,12,13};
		System.out.println(binarySearch(a, 5));
		System.out.println(binarySearch(a, 7));
		System.out.println(binarySearch(a, 11));
		System.out.println(binarySearch(a, 111));
	}

}
