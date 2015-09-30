package edu.cpp.cs240;

import java.util.Arrays;
import java.util.Scanner;

public class WeatherReporter {

	public static void main(String[] args) {
		// 1. get the input number of days
		int numDays = 0;
		System.out.println("Please input the number of days: ");
		Scanner scanner = new Scanner(System.in);
		numDays = scanner.nextInt();

		// 2. let users input the temperature for each day
		int[] data = new int[numDays];
		int total = 0;
		for(int i = 0; i < numDays; i++) {
			System.out.println("Day " + i + ": ");
			data[i] = scanner.nextInt();
			total += data[i];
		}

		// 3. calculate the total, average, and the number of days above the average
		int numDaysAboveAverage = 0;
		double avg = total / numDays;
		for(int t : data) {
			if (t > avg) {
				numDaysAboveAverage++;
			}
		}

		// 4. print out the results
		System.out.println("All temperature data: " + Arrays.toString(data));
		System.out.println("Average: " + avg);
		System.out.println("Number of days above the average: " + numDaysAboveAverage);

		// close the scanner and input stream
		scanner.close();
	}

}
