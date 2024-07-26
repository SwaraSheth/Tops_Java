package com.collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/*
 * Vector:
 * 1.It is dynamic array
 * 		2.Automatically implements list interface
 * 		3.Automatically shrink and grow.
 * 		4.Default size is 0
 * 		5.Default value is []
 * 		6.Default capacity is 10.
 * 		6.the sequence in which data is added and remove the same sequence it will display
 * 		7.Duplicate values are allowed
 * 		8.add() and remove() method
 * 
 * Vector 							ArrayList
 * Doubled the capacity 	Increase 50% of capacity 
 * by 100%
 * Performance is low		Performance is high
 * Synchronized				Asynchronized
 * 
 * 4.Enumerator:
 * When you want display the values in list instead of []
 * 	steps:
 * 1.First give all value to Enumerator object
 * 2.use loop to traverse object
 * 3.to display value
 * 
 */
public class VectorDemo {
public static void main(String[] args) {
	Vector v1=new Vector(3);
	
	System.out.println("Default value is : "+v1);
	System.out.println("Default  size is : "+v1.size());
	System.out.println("Default capacity is : "+v1.capacity());
	
	v1.add(12);
	v1.add(12.12f);
	v1.add('S');
	v1.add("Swara");
	v1.add(new Integer(150));
	
	System.out.println("Now  value is : "+v1);
	System.out.println("Now  size is : "+v1.size());
	System.out.println("now capacity is : "+v1.capacity());
	
	v1.add("Swara");
	
	System.out.println("Now value is : "+v1);
	System.out.println("Now size is : "+v1.size());
	System.out.println("now capacity is : "+v1.capacity());
	
	v1.remove(0);
	v1.remove("Swara");
	
	System.out.println("Now value is : "+v1);
	System.out.println("Now size is : "+v1.size());	
	System.out.println("now capacity is : "+v1.capacity());
	
//	Iterator i1= v1.iterator();
//	
//	while (i1.hasNext()) {
//		System.out.println(i1.next());
//		
//	}
	
	Enumeration e1=v1.elements();
	while (e1.hasMoreElements()) {
		System.out.println(e1.nextElement());
		
	}
}
}
