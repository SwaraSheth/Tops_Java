package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * Collection : to collect primitive and non primitive values into a single object
 * 
 * it contains class and interface
 * 
 * class:
 * 1.ArrayList
 * 		1.It is dynamic array
 * 		2.Automatically implements list interface
 * 		3.Automatically shrink and grow.
 * 		4.Default size is 0
 * 		5.Default value is []
 * 		6.the sequence in which data is added and remove the same sequence it will display
 * 		7.Duplicate values are allowed
 * 		8.add() and remove() method
 * 2.HashSet
 * 3.HashMap
 * 4.Vector
 * 5.Generic
 * 
 * Interface:
 * 1.List
 * 2.Set
 * 3.Map
 * 4.Enumerator
 * 5.Iterator : 
 * 	When you want display the values in list instead of []
 * 	steps:
 * 1.First give all value to iterator object
 * 2.use loop to traverse object
 * 3.to display value
 * 
 */

public class ArrayListDemo {
public static void main(String[] args) {
	ArrayList a1=new ArrayList();
	
	System.out.println("Default array value is : "+a1);
	System.out.println("Default array size is : "+a1.size());
	
	a1.add(12);
	a1.add(12.12f);
	a1.add('S');
	a1.add("Swara");
	a1.add(new Integer(150));
	
	System.out.println("Now array value is : "+a1);
	System.out.println("Now array size is : "+a1.size());
	
	a1.add("Swara");
	
	System.out.println("Now array value is : "+a1);
	System.out.println("Now array size is : "+a1.size());
	
	a1.remove(0);
	a1.remove("Swara");
	
	System.out.println("Now array value is : "+a1);
	System.out.println("Now array size is : "+a1.size());	
	
	Iterator i1= a1.iterator();
	
	while (i1.hasNext()) {
		System.out.println(i1.next());
		
	}
	
	
}
}
