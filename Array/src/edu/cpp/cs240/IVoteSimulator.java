package edu.cpp.cs240;

import java.util.Arrays;
import java.util.Scanner;

public class IVoteSimulator {

	public static void main(String[] args) {
		int[] counter = new int[26];
		// Assume that users only input A-Z
		Scanner s = new Scanner(System.in);
		String input = s.next();
		while(!input.equals("end")) {
			counter[input.charAt(0) - 65]++;
			input = s.next();
		}

		System.out.println(Arrays.toString(counter));
	}

}
