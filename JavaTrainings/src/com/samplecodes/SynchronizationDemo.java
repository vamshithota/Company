package com.samplecodes;

public class SynchronizationDemo {

	public static void main(String[] args) {
		DisplayMessage displayMessage = new DisplayMessage();
		SecondThread thread1 = new SecondThread(displayMessage, "vamshi"); 
		SecondThread thread2 = new SecondThread(displayMessage, "krishna");
		thread1.start();
		thread2.start();
	}
}
