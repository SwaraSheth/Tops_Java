package com.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * HashSet:
 *		1.It is dynamic array
 * 		2.Automatically implements map interface
 * 		3.Automatically shrink and grow.
 * 		4.Default size is 0
 * 		5.Default value is {}
 * 		6.It has pair <K,V>
 * 		7.All pair has its own hash key
 * 		8.all hash keys are converted into hash code
 * 		9.all values are displayed has code wise
 * 		10.Duplicate values are not allowed
 * 		11.put() and remove() method
 * 
 * ArrayList : If we use duplicate data
 * Hasset : Use main in searching
 * HashMap : If vaule has to be address by the key
 */
public class HashMapDemo {
public static void main(String[] args) {
	HashMap h1=new HashMap();
	
	System.out.println("defaule valuse is : "+h1);
	System.out.println("default size is : "+h1.size());
	
	h1.put(1, 123444);
	h1.put("Swara", 123456789);
	h1.put("Utsav", "Shah");
	h1.put(23.5f, 's');
	
	System.out.println("Now value is : "+h1);
	System.out.println("Now size is : "+h1.size());
	
	h1.put("Utsav", "Shah");
	System.out.println("Now value is : "+h1);
	System.out.println("Now size is : "+h1.size());
	
	h1.remove(23.5f);
	System.out.println("Now value is : "+h1);
	System.out.println("Now size is : "+h1.size());
	
	Set set=h1.entrySet();
	
	Iterator i1=set.iterator();
	
	while (i1.hasNext()) {
	//ystem.out.println(i1.hasNext());
		//To seperate key and value
		Map.Entry me=(Map.Entry) i1.next();
		
		System.out.println("Key is : "+me.getKey());
		System.out.println("Value is : "+me.getValue());

		
	}
	
	
}
}
