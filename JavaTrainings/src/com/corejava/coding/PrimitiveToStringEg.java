package com.corejava.coding;

public class PrimitiveToStringEg {

	public static void main(String[] args) {

		// converting primitive to string
		byte b = 100;
		String primitiveString = Byte.toString(b);
		// converting String to primitive
		byte stringPrimiitive = Byte.parseByte(primitiveString);
		System.out.println(primitiveString + " " + stringPrimiitive);
		int i = 299;
		String intToString = Integer.toString(i);
		Integer stringtoInt = Integer.parseInt(intToString);
		System.out.println(intToString + " " + stringtoInt);

	}

}
