package com.oops;
/*
 * 3.Hierarchical: one parent multiple child
 * 
 */
class parent{
	String p_name;
	long ph_no;
	
	public void setParent() {
		p_name="Akshat Sheth";
		ph_no=9429555234l;
	}
}

class child1 extends parent{
	String c1_name="Swara";
	
	public void show() {
		System.out.println("If any complain of "+c1_name+" "+p_name+" call "+ph_no);
	}
}

class child2 extends parent{
	String c2_name="Utsav";
	
	public void show() {
		System.out.println("If any complain of "+c2_name+" "+p_name+ " call "+ph_no);
	}
}
public class InheritanceDemo2 {
public static void main(String[] args) {
	child1 ch1=new child1();
	ch1.setParent();
	ch1.show();
	
	child2 ch2=new child2();
	ch2.setParent();
	ch2.show();
}
}
