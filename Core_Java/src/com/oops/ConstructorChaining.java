package com.oops;
/*
 * Overriding:
 * same function same parameter same return type
 * but diff function body//func def
 * 
 * keyword :
 * super : call the function of the immediate parent
 * 
 */

class A {
	public void show() {
		System.out.println("In class A");
	}
	
	public A() {
		System.out.println("In constructor A");
	}
}

class B extends A{
	public void show() {
		super.show();
		System.out.println("In class B");
	}
	
	 public B() 
	 {
		System.out.println("In constructor B");
	}
}

class C extends B{
	public void show() {
		super.show();
		System.out.println("In class C");
	}
	
	 public C() 
	 {
		System.out.println("In constructor C");
	}
}
public class ConstructorChaining {
	public static void main(String[] args) {
		C c=new C();
		c.show();
	}

}
