package com.corejava.coding;

public class ObjectToStringEg {
	public static void main(String[] args) {

		long x = 200;
		Long doubleObj = Long.valueOf(x);
		String doubleString = doubleObj.toString();
		Long longval = Long.valueOf(doubleString);

	}
}
