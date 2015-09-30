package edu.cpp.cs240;

import java.util.Random;

public class CallCenterSimulation {

	public static CallCenterSystem callCenter = new CallCenterSystem();

	public static void main(String[] args) {
		new Thread(new CallerThread()).start();
		new Thread(new RepresentativeThread()).start();
	}

	static class CallerThread implements Runnable {
		@Override
		public void run() {
			Random r = new Random();
			while(true) {
				int totalCustomersInOneRound = r.nextInt(10);
				for(int i = 0 ; i < totalCustomersInOneRound; i++) {
					callCenter.putCustomerRequest(r.nextInt(1000000));
				}
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	static class RepresentativeThread implements Runnable {
		@Override
		public void run() {
			Random r = new Random();
			while(true) {
				int totalCustomersToServeInOneRound = r.nextInt(10);
				for(int i = 0 ; i < totalCustomersToServeInOneRound; i++) {
					int nextId = callCenter.getNextCustomerId();
					System.out.println("Serving customer " + nextId + " ...");
				}
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
