package com.demo.petstore;

public class Pet {
    int appearance;
    int energy;
    String type;

    public String speak(){
		System.out.println("pet is eating");

		if("Dog".equals(this.type))
			return "멍멍";
		else if("Cat".equals(this.type))
			return("야옹");
		else
			return("소리낼줄 모릅니다");
	}


	public void eat(){

		if("Dog".equals(type)){
			energy = energy + 2;
			speak();	
		}
		else if("Cat".equals(type))
			energy = energy + 1;
	}

	public void sleep(){

        Pet pet = this;
		if("Dog".equals(pet.type)){
			pet.energy = pet.energy + 1;
		}else if("Cat".equals(pet.type)){
			pet.appearance = pet.appearance + 1;
			pet.energy = pet.energy + 1;
		}

	}


}
