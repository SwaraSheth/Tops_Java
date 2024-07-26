package com.fileIO;

import java.io.File;
import java.io.IOException;

/*
 * File is a class
 */
class FDemo{
	File file;
	
	public FDemo() {
		file=new File("file3.txt");
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		display();
	}
	public void display() {
		System.out.println("Is file or not "+file.isFile());
		System.out.println("Is Directory or not "+file.isDirectory());
		System.out.println("can write or not "+file.canWrite());
		System.out.println("can read or not "+file.canRead());
		System.out.println("File Name : "+file.getName());
		System.out.println("File path : "+file.getPath());
		System.out.println("get absolute path : "+file.getAbsoluteFile());
	}
}
public class FileDemo {
public static void main(String[] args) {
	new FDemo();
}
}
