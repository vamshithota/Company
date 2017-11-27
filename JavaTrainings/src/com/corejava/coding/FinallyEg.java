package com.corejava.coding;

import java.util.Scanner;

public class FinallyEg {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0,b = 0;
		try {
		System.out.println("enter a number");
		 a =sc.nextInt();
		System.out.println("enter second number");
		  b= sc.nextInt();
		 System.out.println(a/b);
		} catch(ArithmeticException rr){
			System.out.println("entered two numbers greater than 0");
		}
		finally {
			System.out.println("finally is executed");
		
		}
				
	}
	
	
}
