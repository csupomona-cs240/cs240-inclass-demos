package edu.cpp.cs240;

public class SLinkedListTest {

	public static void main(String[] args) {
		SLinkedList intArrayList = new SLinkedList();
		System.out.println(intArrayList);

		// add elements
		intArrayList.add(5);
		intArrayList.add(10);
		intArrayList.add(5);
		System.out.println(intArrayList);
		System.out.println("Size: " + intArrayList.size());

		intArrayList.add(2, 88);
		System.out.println(intArrayList);
		System.out.println("Size: " + intArrayList.size());

		intArrayList.add(5);
		intArrayList.add(10);
		intArrayList.add(5);
		System.out.println(intArrayList);
		System.out.println("Size: " + intArrayList.size());

		// remove elements
		intArrayList.remove(2);
		System.out.println(intArrayList);
		System.out.println("Size: " + intArrayList.size());

		intArrayList.remove(2);
		System.out.println(intArrayList);
		System.out.println("Size: " + intArrayList.size());

		// set/get elements
		System.out.println("Element at index 1: " + intArrayList.get(1));
		intArrayList.set(1, 99);
		System.out.println("Element at index 1: " + intArrayList.get(1));
		System.out.println(intArrayList);
		System.out.println("Size: " + intArrayList.size());

		// get index
		System.out.println(intArrayList.indexOf(99));
		System.out.println(intArrayList.indexOf(99999));

		// clear
		intArrayList.clear();
		System.out.println(intArrayList);
		System.out.println("Size: " + intArrayList.size());

	}

}
