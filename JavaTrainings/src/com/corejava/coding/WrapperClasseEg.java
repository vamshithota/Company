package com.corejava.coding;

public class WrapperClasseEg {

	public static void main(String[] args) {

		//converting prmitive to object
		int num = 10;
		Integer boxedValue=  Integer.valueOf(num);
		//converting object type to primitive
		
		int unBoxedValue = boxedValue.intValue();
	}

}
