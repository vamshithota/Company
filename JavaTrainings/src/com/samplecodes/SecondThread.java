package com.samplecodes;

public class SecondThread extends Thread {

	DisplayMessage displayMessage;
	String name;
	SecondThread(DisplayMessage displayMessage, String name){
		this.displayMessage = displayMessage;
		this.name = name;
			}
	public void run() {
		displayMessage.sayHello(name);
	}
}
