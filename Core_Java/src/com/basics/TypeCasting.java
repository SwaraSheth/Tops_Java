package com.basics;

public class TypeCasting {
public static void main(String[] args) {
	int i1=10; //4
	long l1=i1; //8
	System.out.println("Implicite conversion :"+l1);
	
	int i2=(int) l1;
	System.out.println("Explicite conversion :"+i2);
	
	int i3=128;
	byte b1=(byte) i3;
	System.out.println("Conversion of int to bite is :"+b1);
	
	char ch='s';
	int i4=ch;
	System.out.println("Conversion of ch to int is :"+i4);
}
}
