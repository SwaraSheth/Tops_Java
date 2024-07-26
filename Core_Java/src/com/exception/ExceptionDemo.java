package com.exception;

import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.function.BiConsumer;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

/*
 * Exception : Any abnormal condition
 * Exception class is root class for all exception.
 * 
 * 1.Compile time error : syntax error, ; , } missing.
 * 
 * 2.Runtime error : Arithmetic exception , ArrayIndexOutOfBound , NumberFormatException etc....
 * 
 * 3.Error : Developer Mistake.
 * 
 * Keywords:
 * 1.Try:
 * 		1.if you doubt that code may have error it should be written in try block.
 * 		2.the code which have error will be skipped and remaining code must be executed.
 * 		3.try throw the error to the catch block.
 * 		4.try must be followed by catch block or finally or both.
 * 2.catch :
 * 		1.whenever error is thrown by try block , catch block handle the error.
 * 		2.there may be multiple catch.
 * 3.finally :
 * 		1.Weather error is there or not finally block will be executed.
 * 4.throw :
 * 5.throws :
 * 
 */
public class ExceptionDemo {
public static void main(String[] args) {
	
	int a=10,b=0;
	int[] num=new int[3];
	
	try {
		System.out.println("Division is : "+a/b);
		for (int i = 0; i <= 3; i++) {
			num[i]=i+1;
			System.out.println(num[i]);
			
		}
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	
	finally {
		System.out.println("This code is written by swara shah");
		System.out.println("Ph no is 1234567890");
	}
	
}
}
