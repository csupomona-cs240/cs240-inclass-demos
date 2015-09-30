package edu.cpp.cs240.list.generics;

public class ListTest {

	public static void main(String args[]) {
		//GenericList<String> list = new GenericArrayList<String>();
		GenericList<String> list = new GenericSLinkedList<>();
		list.add("test1");
		list.add("test2");
		list.add("test3");
		list.add("test4");

		System.out.println(list);
	}
}
