package com.samplecodes;

public class ThreadNamingEg extends Thread{

	public static void main(String[] args) {
	
		ThreadNamingEg threadNamingEg = new ThreadNamingEg();
		threadNamingEg.start();
		
	}
	
	public void run() {
		Thread currentThread = Thread.currentThread();
		currentThread.setName("Some thread");
		System.out.println("name of the current thread is " +currentThread.getName());
	}
	
}
