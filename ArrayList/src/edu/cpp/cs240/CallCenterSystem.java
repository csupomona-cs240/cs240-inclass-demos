package edu.cpp.cs240;

import java.util.Random;

public class CallCenterSystem {

	IntArrayList customers = new IntArrayList();

	public void putCustomerRequest(int customerId) {
		System.out.println("Customer " + customerId + " is added in the list.");
		customers.add(customerId);
		System.out.println("There are currently " + customers.size() + " customers in the list.");
	}

	public int getNextCustomerId() {
		if (customers.size() == 0) {
			return -1;
		}
		int customerId = customers.get(0);
		customers.remove(0);
		System.out.println("Return the next customer: " + customerId);
		System.out.println("There are currently " + customers.size() + " customers in the list.");
		return customerId;
	}

	public static void main(String[] args) {
		Random r = new Random();
		CallCenterSystem callCenter = new CallCenterSystem();
		for(int i = 0 ; i < 100; i++) {
			callCenter.putCustomerRequest(r.nextInt(1000000));
		}
		for(int i = 0 ; i < 100; i++) {
			int nextId = callCenter.getNextCustomerId();
			System.out.println("Serving customer " + nextId + " ...");
		}
	}
}
