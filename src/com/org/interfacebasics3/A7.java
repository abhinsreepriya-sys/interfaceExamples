package com.org.interfacebasics3;

class A7 implements printable,showable{  
	public void print() {
		System.out.println("Hello");
		}  
	public void show() {
		System.out.println("Welcome");
		}  
  
	public static void main(String args[])	{  
		A7 obj = new A7();  
		obj.print();  
		obj.show();  
	}  
} 

