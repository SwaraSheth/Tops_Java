package com.oops;

class VolumeOfBox{
	double length,width,height;
	//default constructor
	public VolumeOfBox() {
		System.out.println("In a default constructor");
		length=1;
		width=2;
		height=3;
	}

	
	
		//parameterized constructor
		public VolumeOfBox(double l,double w,double h) {
			System.out.println("In a parameterized constructor");
			length=l;
			width=w;
			height=h;
		}
	
//		Copy constructor
				public VolumeOfBox(VolumeOfBox vob) {
					System.out.println("In a copy constructor");
					length=vob.length;
					width=vob.width;
					height=vob.height;
				}
	
		
	public void volume() {
		System.out.println("Volume of the box is :"+(length*width*height));
		
	}
/*
 * 
 * constructor : it is a special member function which is initialized automatically.
 * 1.same same name as class name
 * 2.it has no return type
 * 3.it is automatically invoked whenever the object is created 
 * 
 * types:
 * 1.Default constructor(without parameter)
 * 2.parameterized constructor(with parameter)
 * 3.copy constructor(object as a parameter)//clone a object
 * 
 *can call it constructor over loading : same const name diff parameter
 *
 */
}
public class ConstructorDemo {
	public static void main(String[] args) {
	VolumeOfBox dc=new VolumeOfBox();
	dc.volume();
	
	VolumeOfBox pc=new VolumeOfBox(10,20,30);
	pc.volume();
	
	VolumeOfBox cc=new VolumeOfBox(pc);
	cc.volume();
}
}

