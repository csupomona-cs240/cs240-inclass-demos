package edu.cpp.cs240.example;

public class Test {

	public static void main(String[] args) {
		Box<Integer> box = new Box<Integer>();
		box.setValue(3);
		System.out.println(box.getValue());

		Box<String> box2 = new Box<String>();
		box2.setValue("3");
		System.out.println(box2.getValue());
	}

}
