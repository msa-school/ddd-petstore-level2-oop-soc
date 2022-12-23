package com.demo.petstore;

public class Cat extends Pet{
 
	public void speak(){
        System.out.println("야옹");
	}


	public void eat(){
        energy = energy + 1;
	}

	public void sleep(){
        appearance = appearance + 1;
        energy = energy + 1;
	}

}
