package com.org.interfacebasics5;

interface Drawable {  
	void draw();  
	
	default void msg() {
		System.out.println("default method");
		}  
} 
