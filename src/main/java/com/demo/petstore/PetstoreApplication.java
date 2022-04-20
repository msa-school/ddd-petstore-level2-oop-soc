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

		speak(dog);

		eat(dog);

		System.out.println("appearance=" + dog.appearance);
		System.out.println("energy=" + dog.energy);

		sleep(dog);

		System.out.println("appearance=" + dog.appearance);
		System.out.println("energy=" + dog.energy);

		//SpringApplication.run(PetstoreApplication.class, args);
	}

	public static void speak(Pet pet){
		System.out.println("pet is speaking");

		pet.speak();
	}


	public static void eat(Pet pet){
		System.out.println("pet is eating");

		pet.eat();
	}

	public static void sleep(Pet pet){
		System.out.println("pet is sleeping");

		pet.sleep();

	}

}
