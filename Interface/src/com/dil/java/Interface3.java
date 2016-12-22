package com.dil.java;

interface Printable3{
	void print();
}

interface Showable3 extends Printable3{
	void show();
}

public class Interface3 {
	public void print(){
		System.out.println("Hello");
		}
	public void show(){
		System.out.println("Dileep");
	}
	
	public static void main(String[] args) {
		Interface3 obj=new Interface3();
		
		obj.print();
		obj.show();
	}

}
