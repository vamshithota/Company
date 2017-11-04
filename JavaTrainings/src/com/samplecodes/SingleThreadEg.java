package com.samplecodes;

public class SingleThreadEg {

	public static void main(String[] args) {
		SingleThreadEg singleThreadEg = new SingleThreadEg();
		singleThreadEg.printNumbers();
		for(int index=0;index<10;index++) {
			System.out.print("index j " + index+ "\n");
		}
	}
	
	void printNumbers() {
		for(int index=0;index<10;index++) {
		System.out.print("index i " + index+ "\n");
	}
	}
}
