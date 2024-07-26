package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class VectorDemo2 {
public static void main(String[] args) {
	
	Student s1=new Student();
	s1.setId(1);
	s1.setName("Swara");
	s1.setBranch("CS");
	s1.setCity("Surat");
	
	Student s2=new Student();
	s2.setId(2);
	s2.setName("Utsav");
	s2.setBranch("ME");
	s2.setCity("Bharuch");
	
	ArrayList<Student> a1=new ArrayList<Student>();
	
	a1.add(s1);
	a1.add(s2);
	
	Iterator<Student> i1=a1.iterator();
	while (i1.hasNext()) {
		Student s = (Student) i1.next();
		
		System.out.println("Id is : "+s.getId());
		System.out.println("Name is : "+s.getName());
		System.out.println("Branch is : "+s.getBranch());
		System.out.println("City is : "+s.getCity());
		System.out.println();
	}
	
	
	
}
}
