package com.oops;

import java.util.Scanner;

/*
 * scanner :
 * it is a class
 * derived from java until package
 * main purpose is to take input from user
 * use system.in as parameter
 * 
 * data type            scanner class function
 * int                       nextInt()
 * float                     nextFloat()
 * long                      nextLong()
 * boolean                   nextBoolean()
 * double                    nextDouble()
 * char                      next().CharAt(0);
 * 
 * class
 * string
 * word                      next()   
 * stop reading when space key is pressed
 * line                      nextLine()
 * stop reading when enter key is pressed
 * 
 *  
 */
public class ScannerDemo {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Scanner sc1=new Scanner(System.in);
	
	int a,b;
	
	System.out.println("Enter the value of a :");
	a=sc.nextInt();
	
	System.out.println("Enter the value of b :");
	b=sc.nextInt();
	
	System.out.println("Sum is :"+(a+b));
	
	char ch;
	
	System.out.println("Enter character :");
	ch=sc.next().charAt(0);
	
	System.out.println("character is :"+ch);
	
//	sc.nextLine(); //buffer clean to print full name or else create new object as below
//	String name;
//	
//	System.out.println("Enter the name :");
//	name=sc.nextLine();
//	
//	System.out.println("Name is :"+name);
	
	String name12;
	
	System.out.println("Enter the full name :");
	name12=sc1.nextLine();
	
	System.out.println("FullName is :"+name12);
}
}
