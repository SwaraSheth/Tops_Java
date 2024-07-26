package com.fileIO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 2.Character Stream: 2 byte/char
 * 		1.FileWriter
 * 		to write data into the file
 * 		2.FileReader
 * 		to read data from the file
 */

public class CharacterStreamDemo {
public static void main(String[] args) {
	
	//to write data into the file
	try {
		//to open and create file
		FileWriter fW= new FileWriter("file2.txt",true);
		//to write into the file
		String msg="\nThis is tops technology surat ring road";
		fW.write(msg);
		//to close file
		fW.close();
		System.out.println("data written");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	//to read data from the file
	try {
		//to open file
		FileReader fr= new FileReader("file2.txt");
		//to read data from file
		int x;
		while ((x=fr.read())!=-1) {
			System.out.print((char)x);
		
	}
		//to close file
		fr.close();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
