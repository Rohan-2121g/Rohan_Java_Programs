package com.rohan;

public class MY_THreaD extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("THREAD RUNNING " + i);
            try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
    }

    public static void main(String[] args) {
        MY_THreaD m = new MY_THreaD();
        m.start(); // Correct method to start a thread
    }
}