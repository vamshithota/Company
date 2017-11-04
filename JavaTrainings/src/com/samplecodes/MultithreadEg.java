package com.samplecodes;

public class MultithreadEg  extends Thread {

	public static void main(String[] args) throws InterruptedException {
		
		MultithreadEg multithreadEg = new MultithreadEg();
		multithreadEg.start();
		for(int index =0; index<10; index++) {
			System.out.print("index j" + "\t");
			Thread.sleep(1000);
		}
		
	}
	
	public void run() {
		for(int index =0; index<10; index++) {
		System.out.print("index i"  + "\t" );
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
		}
}
