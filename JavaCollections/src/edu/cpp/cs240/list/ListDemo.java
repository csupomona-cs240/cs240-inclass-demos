package edu.cpp.cs240.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		List<String> myList = new ArrayList<String>();

		myList.add("yu");
		myList.add("sun");
		System.out.println(myList);

		List<String> myList2 = new LinkedList<String>();
		myList2.add("yu");
		myList2.add("sun");
		myList.addAll(myList2);
		System.out.println(myList);
		System.out.println("Size: " + myList.size());

		System.out.println(myList.contains("yu"));
		System.out.println(myList.indexOf("sun"));
		System.out.println(myList.subList(1, 2));
	}

}
