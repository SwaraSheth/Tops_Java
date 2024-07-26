package com.exception;

import java.util.Scanner;

/*
 * 
 * ATM
 * deposit :
 * withdraw :
 * 2000
 * 3000
 *User defined msg: If you deposit 3000 more you can withdraw 5000.
 * 
 * Throw:
 * 1.must use with user defined exception
 * 2.must inherit exception class into some user defined class to make it user user defined 
 * 3.throw is written inside method
 * 4.throw must be followed by "new" keyword and "constructor"
 * 
 * Throws :
 * 1.throws written after method declaration
 * 2.we can throws user defines as well as system defined exception class
 * 3.multiple class can be used with throws using ","
 * 
 */

class SwaraException extends Exception{

	double amount;
	public SwaraException(double amount) {
		// TODO Auto-generated constructor stub
		this.amount=amount;
	}
	
}

class ATM{
	double ballance;
	public void deposit(double amount) {
//		ballance=ballance+amount;
		ballance+=amount;// short hand operator
		System.out.println("total ballance is :"+ballance);
	}
	
	public void withdraw(double amount) throws SwaraException{
		if(amount<=ballance) {
			ballance-=amount;
			System.out.println("amount withdraw is :"+amount+" remianing ballance is :" +ballance);
		}else {
			double needs=amount-ballance;
			
			throw new SwaraException(needs);
	}
	
}
}
public class UserDefinedException {
public static void main(String[] args) {
	ATM atm=new ATM();
	Scanner sc=new Scanner(System.in);
	double amount;
	
	System.out.println("Enter is amount to be deposited :");
	amount=sc.nextDouble();
	atm.deposit(amount);
	
	System.out.println("Enter is amount to be Withdraw :");
	amount=sc.nextDouble();
	try {
		atm.withdraw(amount);
	} catch (SwaraException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println("If you deposit "+e.amount+"Rs more "+"you can withdraw "+amount+"Rs");
	}
}
}
