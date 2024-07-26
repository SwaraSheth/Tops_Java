package com.basics;

public class SwitchDemo {
public static void main(String[] args) {
	
	int choice=3;
	
	switch (choice) {
	case 1:
		System.out.println("Light is ON");
	break;

	case 2:
		System.out.println("Fan is ON");
	break;
	
	case 3:
		System.out.println("AC is ON");
	break;
	default:
	break;
	}
	
	//Constant & vowel
	
	char ch='a';
	
	switch (ch) {
	case 'a':
	case 'e':
	case 'i':
	case 'o':
	case 'u':
		System.out.println("a is constant");	
	break;
		
	default:
		break;
	}
}
}
