/*
 * class : class is collection of data member and member function
 * object gives permission to access functionality of class
 */
package com.oops;
class student{
	int roll_no;
	String name;
	
	public void setData() {
		roll_no=34;
		name="swara";
	}  
	
	public void show() {
		System.out.println("Roll no is "+roll_no );
		System.out.println("Name is "+name );
	}
}
public class ClassDemo {
	public static void main(String[] args) {
		student s=new student();
		s.setData();
		s.show();
		
	}
}
