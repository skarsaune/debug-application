package com.example;

import org.junit.Test;

public class MonitorTest {

	@Test
	public void testMonitor() throws InterruptedException {
		Lock lock = new Lock();
		new Thread(lock).start();
		new Thread(lock).start();
		Thread.sleep(30000);
	}
        
        public static void main(String[] args) throws InterruptedException{
            new MonitorTest().testMonitor();
        }

}
