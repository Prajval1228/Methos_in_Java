package com.methodintro;

public class NonStaticIntro {
	
	public void example() {
		
		System.out.println("We are inside non-static method");
	}
	
	public static void main(String args[]) {
		
		NonStaticIntro non_static = new NonStaticIntro();
		
		//We need to create object for calling non-static method nither gives error.
		
		non_static.example();
		
	}

}
