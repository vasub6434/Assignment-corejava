package com.fundamental;

public class Pogram53 extends Thread {
	
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " has finished");
    }

    public static void main(String[] args) {
    	Pogram53 t1 = new Pogram53();
    	Pogram53 t2 = new Pogram53();

        t1.setDaemon(true);
        
        t1.start();
        t2.start();
        
        System.out.println("t1 is daemon: " + t1.isDaemon());
        
        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
    }
}
