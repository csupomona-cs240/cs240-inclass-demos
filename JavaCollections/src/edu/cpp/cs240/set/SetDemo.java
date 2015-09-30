package edu.cpp.cs240.set;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		Set<String> mySet = new HashSet<String>();
		mySet.add("a");
		mySet.add("c");
		mySet.add("a");
		mySet.add("d");
		mySet.add("e");
		System.out.println(mySet);
		System.out.println(mySet.size());
		System.out.println(mySet.contains("d"));
		System.out.println(mySet.contains("f"));
	}

}
