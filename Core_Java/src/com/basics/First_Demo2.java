package com.basics;

public class First_Demo2 {
public static void main(String[] argS) {
	int i1=2147483647;   //4
	long l1=21656262656565l; //8
	char ch='a'; //2
	boolean bb=true; //1 bit
	byte b1=127;  //1 byte
	
	float f1=78.451234f; //4 byte
	double d1=949592.984158; //8
	
	System.out.println("Integer value is :"+i1);
	System.out.println("Long valuse is :"+l1);
	System.out.println("Char value is :"+ch);
	System.out.println("Boolean value is :"+bb);
	System.out.println("Byte value is :"+b1);
	System.out.println("Float value is :"+f1);
	System.out.println("Double value is :"+d1);
	
	System.out.println("Size of integer is :"+Integer.BYTES);
	System.out.println("size of long  is :"+Long.BYTES);
	System.out.println("Size of char is :"+Character.BYTES);
	System.out.println("Size of Byte is :"+Byte.BYTES);
	System.out.println("Size of flot is :"+Float.BYTES);
}
}
