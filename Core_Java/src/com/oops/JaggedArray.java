package com.oops;
/*
 * JaggedArray:
 * same as 2D array 
 * nub of row is fixed but col is not fixed
 * 
 * 1 2 3
 * 1 2 3 4 5
 * 1 2
 * 
 * 
 */

import java.util.Scanner;

public class JaggedArray {
public static void main(String[] args) {
	
	Scanner sc= new Scanner(System.in);
	
	int nrow,ncol;
	System.out.println("Enter the nub of row:");
	nrow=sc.nextInt();
	
	int[][]a=new int[nrow][]; // col size not mentioned
	
	for (int i = 0; i < a.length; i++) {
		System.out.println("Enter the nub of col in row no "+(i+1)+" :");
		ncol=sc.nextInt();
		a[i]=new int[ncol];//assign for col size
		
	}
	
	//to insert the value in row & col by user
	
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a[i].length; j++) {
			System.out.println("Enter the value in row ["+(i+1)+"]["+(j+1)+"]");
			a[i][j]=sc.nextInt();
			
		}
		
	}
	
	
	//to display as Array
	System.out.println();
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a[i].length; j++) {
			System.out.print(" "+a[i][j]);
				
		}
		System.out.println();
	}
}
}
