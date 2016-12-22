package com.dil.java;

interface printable1{
	void print();
}

public class Interface1 implements printable1{
	public void print() {
		System.out.println("Hello Dileep");
	   }
	
	public static void main(String[] args) {
		Interface1 obj=new Interface1();
		obj.print();
	}

}

/*In this example, Printable interface have only one method, 
 * its implementation is provided in the A class.*/
 