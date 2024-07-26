package com.basics;


/*
 * Loop : iterative , repetitive
 * 
 * 1.Entry control:
 * 
 * for
 * syn:
 * for(Initialization;condition;incree/decree)
 * {
 * statement;
 * }
 * 
 * While
 * syn:
 *Initialization;
 *while(condition);{
 *statement;
 *incree/decree;
 *}
 *
 *2.Exit control
 *
 *do while
 *syn:
 *Initialization;
 *do{
 *statement:
 *incree/decree;
 *}while(condition);
 *
 */
public class LoopingDemo {
public static void main(String[] args) {
	
	for (int i = 1; i<=5; i++) { 	//6
		System.out.println(i);      //5
	}
	//11 times loop executed
	
	
	System.out.println("while loop");
	int j = 1;						//1
	while (j<=5) {					//6
		System.out.println(j);		//5
		j++;						//5
	}
	//17 times loop executed
	
	
	System.out.println(" Do while loop");
	int k=1;						//1
	do {							
		System.out.println(k);		//5
		k++;						//6	
	} while (k<=5);					//6
}
}
