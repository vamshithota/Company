package com.samplecodes;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashtableDemo {

	public static void main(String args[]) {
	     
	      Hashtable balance = new Hashtable();
	      Enumeration names;
	      String str;
	      double bal;

	      balance.put("vamshi", new Double(3434.34));
	      balance.put("krishna", new Double(123.22));
	      balance.put("ram", new Double(1378.00));
	      balance.put("kumar", new Double(99.22));
	      balance.put("harish", new Double(19.08));

	     
	      names = balance.keys();
	      
	      while(names.hasMoreElements()) {
	         str = (String) names.nextElement();
	         System.out.println(str + ": " + balance.get(str));
	      }        
	      System.out.println();
	      
	        bal = ((Double)balance.get("krishna")).doubleValue();
	      balance.put("krishna", new Double(bal + 1000));
	      System.out.println("Zara's new balance: " + balance.get("krishna"));
	   }
	
	
}
