package com.keyword;
/*
 * Keyword:
 * 1.super
 * 2.abstract
 * 3.final
 * 4.this
 * 5.static
 * 6.interface
 * 
 * 
 * 
 * Abstract : Details are hidden only essential info is show
 * 
 * use with class:
 * 1.Abstract class cannot create object
 * 2.must inherit into some other class
 * 
 * 
 * use with method
 * 1. abstract method cannot have method body
 * 2. must override into child class
 * 3. abstract method must have abstract class
 * 
 */

abstract class Ademo{
	int roll_no;
	String name;
	
	public void setData() {
		roll_no = 123;
		name = "Swara";
	}
	public abstract void show();
}
class Demo extends Ademo{
	
	@Override
	public void show() {
		System.out.println("roll no is :"+roll_no);
		System.out.println("name is  :"+name);
	}
}
public class AbstractionDemo {
	public static void main(String[] args) {
//		Ademo ademo=new Ademo();
		Demo d1=new Demo();
		d1.setData();
		d1.show();
	}
}