package com.samplecodes;

public class ThreadPriority extends Thread{

	public static void main(String[] args) {
	
		ThreadPriority Thread1 = new ThreadPriority();
		Thread1.setPriority(MIN_PRIORITY);
		Thread1.setName("Thread_1");
		Thread1.start();
		
		ThreadPriority Thread2 = new ThreadPriority();
		Thread2.setPriority(MAX_PRIORITY);
		Thread2.setName("Thread_2");
		Thread2.start();
		
	}
	
	public void run() {
		System.out.println("Current thread name is " +Thread.currentThread().getName());
	}
	
}
