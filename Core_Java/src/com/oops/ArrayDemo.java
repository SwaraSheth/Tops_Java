package com.oops;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.text.StyledEditorKit.ForegroundAction;

/*
 * Array : collection of data of similar type
 * 1.start with indax 0
 * 2.size = length-1
 * 3.if data enter is greater than the size it will give exception ArrayIndexOutofBound()
 * 
 * types:
 * 1 D Array
 * 2 D Array
 * jagged/ragged Array
 * 
 */
public class ArrayDemo {
public static void main(String[] args) {
	//syn : datatype[] [Variable_name]=new datatype[size];
	
	int[] a=new int[5];
	
	for (int i = 0; i < a.length; i++) {
		a[i]=i+1;
		
	}
	
	for (int j = 0; j < a.length; j++) {
		System.out.println(a[j]);
	}
	
	
	//23  4 23 67 2 5
	//selection sort,bubble sort
	
	Scanner sc=new Scanner(System.in);
	int[] num=new int[5];
	
	System.out.println("enter the valuse :");
	for (int i = 0; i < num.length; i++) {
		num[i]=sc.nextInt();
		
	}
//	for (int i = 0; i < num.length; i++) {
//		for (int j = 0; j < num.length; j++) {
//			if (num[i]>num[j]) {
//				
//				int temp=num[i];//23
//				num[i]=num[j];//4
//				num[j]=temp;//23
//				
//			}
//			
//		}
//		
//	}
	Arrays.sort(num);
	for (int i = 0; i < num.length; i++) {
		System.out.print(num[i]);
		
	}
}
}
