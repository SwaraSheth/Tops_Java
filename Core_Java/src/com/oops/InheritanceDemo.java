package com.oops;
/*
 * Inheritance: making a class from another class
 * deriving attribute of some other class
 * 
 * Adv;
 * Re usability
 * Extensibility
 * Less object creation (only last child object created)
 * use "extends" as key word to inherit the parent
 * 
 * Types:
 * 1.Single:one parent one child
 * 2.Multilevel: one grand parent one parent one child 
 * 3.Hierarchical: one parent multiple child
 * 4.Multiple : multiple parent single child(not directly supported in java)
 * 5.Hybrid: combination of any two types
 * 
 */
class student1{
	protected int id;
	protected String name;
	
	public void setData() {
		id = 1;
		name="Swara";
	}
	
	
}

class sports extends student1{
	int sports_marks=85;
	
	
}

class Result extends sports{
	String result="A+";
	public void show() {
		System.out.println("Id is "+id);
		System.out.println("Name is "+name);
		System.out.println("Sports marks is "+sports_marks);
		System.out.println("Result is "+result);
		
	}
	
}
public class InheritanceDemo {
	public static void main(String[] args) {
//		sports sp=new sports();
//		sp.setData();
//		sp.show();
		
		Result rs=new Result();
		rs.setData();
		rs.show();
	}

}
