package com.demo.petstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PetstoreApplication {

	public static void main(String[] args) {

		Pet pet = new Pet();
		pet.appearance = 0;
		pet.energy = 0;
		pet.type = "Dog";

		pet.speak();

		System.out.println("appearance=" + pet.appearance);
		System.out.println("energy=" + pet.energy);

		pet.sleep();

		System.out.println("appearance=" + pet.appearance);
		System.out.println("energy=" + pet.energy);
	}


}
