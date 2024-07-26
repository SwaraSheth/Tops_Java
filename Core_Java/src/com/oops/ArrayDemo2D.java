package com.oops;
/*
 * 2D array:
 * combination of row and col:
 * Int [row][col]
 */
public class ArrayDemo2D {
public static void main(String[] args) {
	int [][] a=new int[3][3];
	
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a.length; j++) {
			a[i][j]=j+1;
			System.out.print(" "+a[i][j]);
		}
		System.out.println();
	}
	
int [][] b=new int[3][3];
	
	for (int i = 0; i < b.length; i++) {
		for (int j = 0; j < b.length; j++) {
			b[i][j]=j+4;
			System.out.print(" "+b[i][j]);
		}
		System.out.println();
	}
	
	System.out.println("Sum of Arrays are:");
	
int [][] c=new int[3][3];
	
	for (int i = 0; i < c.length; i++) {
		for (int j = 0; j < c.length; j++) {
			c[i][j]=a[i][j]+b[i][j];
			System.out.print(" "+c[i][j]);
		}
		System.out.println();
	}
}
}
