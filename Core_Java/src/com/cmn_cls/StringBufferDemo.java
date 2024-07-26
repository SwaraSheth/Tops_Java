package com.cmn_cls;
/*
 * String buffer : Mutable
 */

public class StringBufferDemo {
public static void main(String[] args) {
	StringBuffer s1=new StringBuffer("This is tops tech....");
	System.out.println("Original string value is : "+s1);
	System.out.println("Original string length is : "+s1.length());
	
	s1.insert(0,"Hi ");
	System.out.println("Now string value is : "+s1);
	System.out.println("Now string length is : "+s1.length());
	
	s1.append("Swara");
	System.out.println("Now string value is : "+s1);
	System.out.println("Now string length is : "+s1.length());
	
	s1.delete(0, 4);
	System.out.println("Now string value is : "+s1);
	System.out.println("Now string length is : "+s1.length());
	
	s1.replace(0, 3, "");
	System.out.println("Now string value is : "+s1);
	System.out.println("Now string length is : "+s1.length());
	
	s1.reverse();
	System.out.println("Now string value is : "+s1);
	System.out.println("Now string length is : "+s1.length());
	
	
}
}
