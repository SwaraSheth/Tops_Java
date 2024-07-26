package com.thread;
/*
 * Thread : Light weight process
 * main is tread
 * whenever process is start
 * 
 * Multi thread : multiprocessing,multitasking
 * 
 * thread life cycle
 * newborn
 * runnable
 * running
 * block
 * dead
 * 
 * thread can be achieve in 2 ways.
 * 1.by using thread class
 * 2.by using thread interface
 */

import java.util.Iterator;

class First extends Thread{
	
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("This is first thread");
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
	}
}
public class ThreadDemo {
public static void main(String[] args) throws InterruptedException {
	First f1=new First();
	f1.start();
	
	for (int i = 1; i <= 5; i++) {
		System.out.println("This is main thread");
		Thread.sleep(2000);
	}
}
}
