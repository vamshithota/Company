package com.samplecodes;

import java.util.Scanner;

public class JoinThreadDemo extends Thread {

	static int i,sum=0;
	
	public static void main(String[] args)  {
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a number");
		JoinThreadDemo.i = scanner.nextInt();
		JoinThreadDemo joinThreadDemo = new JoinThreadDemo();
		joinThreadDemo.start();
		try {
			joinThreadDemo.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	System.out.println("sum of entered number is " + JoinThreadDemo.sum);
	
	
	}
	public void run() {
		for(int index =1; index<JoinThreadDemo.i; index++) {
			JoinThreadDemo.sum +=index;
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
}}