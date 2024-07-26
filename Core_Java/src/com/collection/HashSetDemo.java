package com.collection;

import java.util.HashSet;
import java.util.Iterator;

/*
 * HashSet:
 *		 1.It is dynamic array
 * 		2.Automatically implements set interface
 * 		3.Automatically shrink and grow.
 * 		4.Default size is 0
 * 		5.Default value is []
 * 		6.All values has its own hash key
 * 		7.all hash keys are converted into hash code
 * 		8.all values are displayed has code wise
 * 		9.Duplicate values are not allowed
 * 		10.add() and remove() method
 * 
 */

public class HashSetDemo {
public static void main(String[] args) {
	HashSet h1=new HashSet();
	
	System.out.println("defaule valuse is : "+h1);
	System.out.println("default size is : "+h1.size());
	
	h1.add(153);
	h1.add(153.153f);
	h1.add('S');
	h1.add("Swara");
h1.add(new Integer(150));
	
	System.out.println("Now array value is : "+h1);
	System.out.println("Now array size is : "+h1.size());
	
	h1.add("Swara");
	
	System.out.println("Now array value is : "+h1);
	System.out.println("Now array size is : "+h1.size());
	

	h1.remove("Swara");
	
	System.out.println("Now array value is : "+h1);
	System.out.println("Now array size is : "+h1.size());	
	
	Iterator i1=h1.iterator();
	
	while (i1.hasNext()) {
		System.out.println(i1.next());
		
	}
	
}
}