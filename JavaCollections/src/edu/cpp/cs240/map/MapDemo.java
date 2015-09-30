package edu.cpp.cs240.map;

import java.util.Map;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
//		Map<String, Integer> myMap = new Hashtable<String, Integer>();
//		Map<String, Integer> myMap = new HashMap<String, Integer>();
		Map<String, Integer> myMap = new TreeMap<String, Integer>();
		myMap.put("a", 56);
		myMap.put("b", 23);
		myMap.put("c", 33);
		myMap.put("e", 59);
		myMap.put("d", 99);
		System.out.println(myMap);
		System.out.println(myMap.get("c"));
		System.out.println(myMap.get("cc"));
		System.out.println(myMap.keySet());
		System.out.println(myMap.values());

	}
}
