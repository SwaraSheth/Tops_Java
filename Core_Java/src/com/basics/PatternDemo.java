package com.basics;
/*
 * 1
 * 12
 * 123
 * 1234
 * 12345
 * 
 * for i(row)
 * initialization
 * first no of pattern
 * 
 * condition
 * largest/smallest no in pattern
 * 
 * smallest to largest <=
 * largest to smallest >=
 * 
 * incree/decree
 * <= ++
 * >= --
 * 
 * for j(coloum)
 * initialization
 * first col of each raw
 * same no : that no only
 * diff no : upper loop name
 * 
 * condition
 * last col of each raw
 * same no : that no only
 * diff no : upper loop name
 * 
 * check each raw
 * smallest to largest <=
 * largest to smallest >=
 * 
 * incree/decree
 * <= ++
 * >= --
 */
public class PatternDemo {
public static void main(String[] args) {
	
	for (int i = 1; i <=5; i++) {
		for (int j = 1; j <=i; j++) {
			System.out.print(j);	
		}
		System.out.println();
	}
	
	for (int i = 5; i >=1; i--) {
		for (int j = i; j <= 5; j++) {
			System.out.print(j);	
		}
		System.out.println();
	}
	
	for (int i = 5; i >=1; i--) {
		for (int j = 5; j >= i; j--) {
			System.out.print(j);	
		}
		System.out.println();
	}
	
	for (int i = 1; i <=5; i++) {
		for (int j = i; j >= 1; j--) {
			System.out.print(j);	
		}
		System.out.println();
	}
//
//+++++1
//++++12
//+++123	
//++1234	
//+12345
//	
//i & j same as above , k is between i & j for +
//
//for k	
//k is completely depends on i	
	
	
	for (int i = 1; i <=5; i++) {
		for (int k = i; k <=5; k++) {
			System.out.print(" ");
			
		}
		for (int j = 1; j <=i; j++) {
			System.out.print(j);	
		}
		System.out.println();
	}

	
//	 *			1*2 2-1
//	***			2*2 4-1
// *****		3*2 6-1
//	***
//	 *

for (int i = 1; i <=3; i++) {
	for (int k = i; k <=3; k++) {
		System.out.print(" ");
	}
	for (int j = 1; j <= i*2-1; j++) {
		System.out.print("*");
	}
	System.out.println();
}	

for (int i = 2; i >=1; i--) {
	for (int k = i; k <=3; k++) {
		System.out.print(" ");
	}
	for (int j = i*2-1; j >=1; j--) {
		System.out.print("*");
	}
	System.out.println();
}	
	
}
}

