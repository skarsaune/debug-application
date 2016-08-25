package com.example;

import java.util.Date;
import java.util.concurrent.ForkJoinPool;

public class DeadLockedApplication {
	private Object monitor1=new Object();
	private Object monitor2=new Object();
	
	private void mutualLock1() {
		synchronized (monitor1) {
			sleep();
			synchronized (monitor2) {
				System.out.println("Required second lock");
			}
		}
	}
	
	private void lock1()  {
		synchronized (monitor1) {
			sleep();
		}
	}

	private void sleep() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {}
	}

	private void lock2()  {
		synchronized (monitor2) {
			sleep();
		}
	}
	
	private void mutualLock2() {
		synchronized (monitor2) {
			sleep();
			synchronized (monitor1) {
				System.out.println("Retrieved second lock");
			}
		}

	}
	
    public String doIt()  {
        final StringBuilder log=new StringBuilder();
        log.append(new Date() +  " Entering deadlock method");
        ForkJoinPool.commonPool().execute(new Runnable(){

			@Override
			public void run() {
				mutualLock2();
			}});
        mutualLock1();
        log.append(new Date() + " phew! left deadlock method");
        sleep();
        return log.toString();
    }
    
    public static void main(String[] args) {
		new DeadLockedApplication().doIt();
	}
}