package com.cmn_cls;
/*
 * Common class:
 * String : String is immutable
 * String Buffer
 * Wrapper
 * Object
 */

public class StringDemo {
public static void main(String[] args) {
	String s1="This is tops tech....";
	
	System.out.println("String value is : "+s1);
	System.out.println("String leanth is : "+s1.length());
	System.out.println("to upper case : "+s1.toUpperCase());
	System.out.println("to lower case : "+s1.toLowerCase());
	System.out.println("substring is : "+s1.substring(2));
	System.out.println("substring is : "+s1.substring(2, 5));
	System.out.println("chat at : "+s1.charAt(0));
	
	if (s1.equalsIgnoreCase("this is tops tech....")) {
		System.out.println("both strings are same");
		
	} else {
		System.out.println("both strings are different");
	}
}
}
