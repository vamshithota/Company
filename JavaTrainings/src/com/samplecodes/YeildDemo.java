package com.samplecodes;

public class YeildDemo {

	public static void main(String[] args) {
		MyThread mythread = new MyThread();
		mythread.start();
		for(int index=0; index<=10;index++) {
			System.out.println("main class");
		}
		
		
	}
	
}
