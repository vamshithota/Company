package com.samplecodes;

public class DisplayMessage {

	public synchronized void sayHello(String name) {
		for(int index=0; index<5;index++) {
			System.out.println("Hi " + name);
		}
	}
	
}
