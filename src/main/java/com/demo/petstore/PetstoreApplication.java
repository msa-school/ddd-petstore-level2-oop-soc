package com.demo.petstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PetstoreApplication {

	public static void main(String[] args) {

		Pet dog = new Pet();
		dog.appearance = 0;
		dog.energy = 0;
		dog.type = "Dog";

		dog.speak();

		dog.eat();

		System.out.println("appearance=" + dog.appearance);
		System.out.println("energy=" + dog.energy);

		dog.sleep();

		System.out.println("appearance=" + dog.appearance);
		System.out.println("energy=" + dog.energy);

		//SpringApplication.run(PetstoreApplication.class, args);
	}

}
