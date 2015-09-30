package edu.cpp.cs240.app;

import java.util.Scanner;

import edu.cpp.cs240.IntStack;
import edu.cpp.cs240.LinkedListBasedIntStack;

public class ParenthesesChecker {

	public static boolean isValidExpression(String expression) {
		IntStack intStack = new LinkedListBasedIntStack();

		for(int i = 0; i < expression.length(); i++) {
			char c = expression.charAt(i);
			switch (c) {
			case '(' :
				intStack.push(c);
				break;
			case '[' :
				intStack.push(c);
				break;
			case '{' :
				intStack.push(c);
				break;
			case ')' :
				if (intStack.isEmpty() || intStack.pop() != '(') return false;
				break;
			case ']' :
				if (intStack.isEmpty() || intStack.pop() != '[') return false;
				break;
			case '}' :
				if (intStack.isEmpty() || intStack.pop() != '{') return false;
				break;
			}
		}

		return intStack.size() == 0;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.next();
		System.out.println(isValidExpression(input));
	}

}
