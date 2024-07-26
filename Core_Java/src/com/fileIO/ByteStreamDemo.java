package com.fileIO;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/*
 * File:
 * it is a class
 * if we want to store the data permanent we use file
 * we use stream to store data permanent
 * stream : It is is medium to store data
 * if source has the data destination will have too
 * 
 * 1.Byte stream : byte/char
 * 		1.FileOutputStream
 * 		to write data into the file
 * 		2.FileInputStream
 * 		to read data from the file
 * 2.Character Stream: 2 byte/char
 * 		1.FileWriter
 * 		to write data into the file
 * 		2.FileReader
 * 		to read data from the file
 * 
 * steps:
 * 1.to open a file into particular class
 * 2.write/read into/from file
 * 3.to close file
 * 
 * must have errors:
 * IOException
 * FileNotFoundException
 * 
 */

public class ByteStreamDemo {
public static void main(String[] args) {
	
	//to write data into the file
	try {
		//to open and create file
		FileOutputStream foS = new FileOutputStream("file1.txt",true);
		//to write into the file
		String msg="\nThis is tops technology...surat";
		byte[] bb=msg.getBytes();
		foS.write(bb);
		//to close file
		foS.close();
		System.out.println("data written");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	//to read data from the file
	try {
		//to open file
		FileInputStream fiS=new FileInputStream("file1.txt");
		//to read data from file
		int x;
		while ((x=fiS.read())!=-1) {
			System.out.print((char)x);
		
	}
		//to close file
		fiS.close();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
