package edu.cpp.cs240;

import java.util.Random;

public class CallCenterSimulation1 {

	public static void main(String[] args) {
		CallCenterSystem ccs = new CallCenterSystem();

		long startTime = System.currentTimeMillis();

		Random r = new Random();
		for(int i = 0; i < 100000; i++) {
			ccs.putCustomerRequest(r.nextInt(100000));
		}

		for(int i = 0; i < 100000; i++) {
			int c = ccs.getNextCustomer();
		}

		long endTime = System.currentTimeMillis();
		System.out.println("Total time: " + (endTime - startTime));
	}

}
