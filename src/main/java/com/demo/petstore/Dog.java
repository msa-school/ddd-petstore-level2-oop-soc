package com.demo.petstore;

public class Dog extends Pet{
 
	public void speak(){
        System.out.println("멍멍");
	}


	public void eat(){
        energy = energy + 2;
	}

	public void sleep(){
        energy = energy + 1;
	}

}
