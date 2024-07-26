package com.collection;
/*
 * Generic : to generalize the collection into a specific type
 * 
 * ArrayList<Integer>
 * It will only take integer type of data
 */

import java.util.ArrayList;

public class GenericDemo {
public static void main(String[] args) {
	ArrayList<Integer>  a1=new ArrayList<Integer>();
	
	a1.add(34);
	a1.add(new Integer(67));
	
	System.out.println("Now array value is : "+a1);
	System.out.println("Now array size is : "+a1.size());
	
}
}
