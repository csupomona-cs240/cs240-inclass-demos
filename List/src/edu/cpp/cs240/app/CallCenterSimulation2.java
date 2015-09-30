package edu.cpp.cs240.app;

import java.util.Random;

public class CallCenterSimulation2 {

    public static void main(String[] args) {
        final CallCenterSystem ccs = new CallCenterSystem();

        final Random r = new Random();

        Runnable putThread = new Runnable(){
            @Override
            public void run() {
                while(true) {
                    for(int i = 0; i < 10; i++) {
                        ccs.putCustomerRequest(r.nextInt(10000));
                    }
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        Runnable getThread = new Runnable() {
            @Override
            public void run() {
                while(true) {
                    for(int i = 0; i < 5; i++) {
                        ccs.getNextCustomer();
                    }
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        new Thread(putThread).start();
        new Thread(getThread).start();
    }

}
