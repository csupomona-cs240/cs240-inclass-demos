package edu.cpp.cs240.app;

import java.util.Random;

public class CallCenterSimulation1 {

    public static void main(String[] args) {
        CallCenterSystem ccs = new CallCenterSystem();

        Random r = new Random();
        for(int i = 0; i < 100; i++) {
            ccs.putCustomerRequest(r.nextInt(100000));
        }

        for(int i = 0; i < 50; i++) {
            int c = ccs.getNextCustomer();
        }

    }

}
