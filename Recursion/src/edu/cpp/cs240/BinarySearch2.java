package edu.cpp.cs240;


public class BinarySearch2 {

	public static int binarySearch(int[] a, int n, int i, int j) {
		if (i > j) {
			return -1;
		}
		int m = (i + j) / 2;
		if (a[m] == n) {
			return m;
		}
		if (a[m] < n) {
			return binarySearch(a, n, m + 1, j);
		} else {
			return binarySearch(a, n, i, m - 1);
		}
	}

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,7,7,8,9,10,11,12,13};
		System.out.println(binarySearch(a, 5, 0, a.length - 1));
		System.out.println(binarySearch(a, 7, 0, a.length - 1));
		System.out.println(binarySearch(a, 11, 0, a.length - 1));
		System.out.println(binarySearch(a, 111, 0, a.length - 1));
	}

}
