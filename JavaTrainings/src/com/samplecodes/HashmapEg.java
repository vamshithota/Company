package com.samplecodes;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashmapEg {

	public static void main(String args[]) {

	    
	      HashMap<Integer, String> hmap = new HashMap<Integer, String>();

	      /*Adding elements to HashMap*/
	      hmap.put(12, "Chaitanya");
	      hmap.put(2, "Rahul");
	      hmap.put(7, "Singh");
	      hmap.put(49, "Ajeet");
	      hmap.put(3, "Anuj");

	      Set<Integer> keyset = hmap.keySet();
	      System.out.println(keyset);
	       
	  /* Collections  vals=   (Collections) hmap.values();
	   System.out.println(vals);
	  */ 
           	      
 
	      /* Get values based on key*/
	      String var= hmap.get(2);
	      System.out.println("Value at index 2 is: "+var);

	      /* Remove values based on key*/
	      hmap.remove(3);
	      System.out.println("Map key and values after removal:");
	      Set set2 = hmap.entrySet();
	      Iterator iterator2 = set2.iterator();
	      while(iterator2.hasNext()) {
	         // Map.Entry mentry2 = (Map.Entry)iterator2.next();
	    	  Map.Entry mentry2 = (Map.Entry)iterator2.next();
	          System.out.print("Key is: "+mentry2.getKey() + " & Value is: ");
	          System.out.println(mentry2.getValue());
	       }

	   }      
	
}
