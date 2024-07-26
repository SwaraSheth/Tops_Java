/*
 * Condition:
 * If : If condition is true , true statement print else nothing
 * Else if : If condition is true , true stament print else false statement print
 * nested if
 * else if ladder
 * switch
 * 
 * conditional operator : <,>,<=,>=,==
 * logical operator : &&,||,1
 * 
 */

package com.basics;

public class ConditionDemo {
	public static void main(String args[]) {
		int a=9;
		
		if(a>=10){
			System.out.println("a is greater than 10");
		}
		else  {
			System.out.println("a is smallar than 10");
		}
		
		int a1=120,b=130,c=110;
		
//		if (a1>b) {
	//		if (a1>c) {
		//		System.out.println("a1 is greater");
			//} else {
				//System.out.println("c is greater");
			//} 
	//	} else {
	//		if (b>c) {
	//			System.out.println("b is greater");
	//		} else {
	//			System.out.println("C is greater");

		//	}

	//	} 
		
		if (a1>b&&a1>c) {
			System.out.println("a1 is greater");
		} else if (b>c&&b>a1) {
			System.out.println("b is greater");
		} else {
			System.out.println("C is greater");
		}
		}
	}
