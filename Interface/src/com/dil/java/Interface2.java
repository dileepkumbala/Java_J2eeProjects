package com.dil.java;

interface Printable2{
	void print();
}

interface Showable{
	void show();
}

public class Interface2 implements Printable2,Showable {
	public void print(){
		System.out.println("Hello");
		}
	public void show(){
		System.out.println("Dileep");
	}
	
	public static void main(String[] args) {
		Interface2 obj=new Interface2();
		obj.print();
		obj.show();
	}

}
