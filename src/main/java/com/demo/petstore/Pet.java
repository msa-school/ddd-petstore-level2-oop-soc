package com.demo.petstore;

public class Pet {
    int appearance;
    int energy;
    String type;

    public void speak(){
		System.out.println("pet is eating");

		if("Dog".equals(this.type))
			System.out.println("멍멍");
		else if("Cat".equals(this.type))
			System.out.println("야옹");
		else
			System.out.println("소리낼줄 모릅니다");
	}


	public void eat(){
		System.out.println("pet is eating");

		if("Dog".equals(type)){
			energy = energy + 2;
			speak();	
		}
		else if("Cat".equals(type))
			energy = energy + 1;
	}

	public void sleep(){
		System.out.println("pet is sleeping");

        Pet pet = this;
		if("Dog".equals(pet.type)){
			pet.energy = pet.energy + 1;
		}else if("Cat".equals(pet.type)){
			pet.appearance = pet.appearance + 1;
			pet.energy = pet.energy + 1;
		}

	}


}
