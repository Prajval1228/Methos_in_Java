package com.methodintro;

public class MethodIntro {
	
	public static void doAddition() {                          //Static Method
		
		System.out.println("We are inside ststic method");
	}
	
	public static void main(String args[]) {
				
		MethodIntro method_intro = new MethodIntro();
		
		//We are calling static method using object.
		
		method_intro.doAddition();
		
		//We are calling static method without using object.
		
        doAddition();
	}

}
