package edu.cpp.cs240;

public class CallCenterSystem {

	IntList customerList = new IntArrayList();

	public void putCustomerRequest(int customerId) {
		customerList.add(customerId);
		System.out.println("Customrer " + customerId + " has been added in the list");
		System.out.println("Total cutsomers waiting: " + customerList.size());
	}

	public int getNextCustomer() {
		if (customerList.size() == 0) {
			return -1;
		}
		int customerId = customerList.get(0);
		customerList.remove(0);
		System.out.println("Customer " + customerId + " has been served.");
		System.out.println("Total cutsomers waiting: " + customerList.size());
		return customerId;
	}
}
