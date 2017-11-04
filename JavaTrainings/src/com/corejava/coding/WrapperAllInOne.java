package com.corejava.coding;

public class WrapperAllInOne {
	public static void main(String[] args) {
		
		int x=800;
		//converting primitive to string
		String s = Integer.toString(x);
		//converting string to object
		Integer i = new Integer(s);
		//converting object to primitive
         int c =i.intValue();
         //converting primitive to object
         Integer o = Integer.valueOf(c);
         //converting object to string
         String os = Integer.toString(o);
         
         
		
		
		
	}
}
