package com.demo.petstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PetstoreApplication {

	public static void main(String[] args) {

		String type = "Cat";

		Pet pet = null;
		if("Dog".equals(type)){
			pet = new Dog();
		
		}else if("Cat".equals(type)){
			pet = new Cat();
		
		}

		pet.appearance = 0;
		pet.energy = 0;

		pet.speak();

		System.out.println("appearance=" + pet.appearance);
		System.out.println("energy=" + pet.energy);

		pet.sleep();

		System.out.println("appearance=" + pet.appearance);
		System.out.println("energy=" + pet.energy);

	}


}
