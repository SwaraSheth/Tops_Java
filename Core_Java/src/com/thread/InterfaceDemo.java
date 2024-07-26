package com.thread;

 class Second implements Runnable{

	@Override
	public void run() {
		for (int i = 1; i <=5; i++) {
			System.out.println("This is second class");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		// TODO Auto-generated method stub
		
	}
	
}
public class InterfaceDemo {
public static void main(String[] args) throws InterruptedException {
	
	Second s1=new Second();
	Thread t1=new Thread(s1);
	t1.start();
	
	for (int i = 1; i <=5; i++) {
		System.out.println("This is main thread");
		Thread.sleep(2000);
		
	}
	
}
}
