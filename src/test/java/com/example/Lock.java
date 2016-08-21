package com.example;

public class Lock implements Runnable {
	public synchronized void lock() {
		System.out.println("Thread : " + Thread.currentThread() + " holds lock!");
	}

	@Override
	public void run() {
		lock();
		
	}

}
