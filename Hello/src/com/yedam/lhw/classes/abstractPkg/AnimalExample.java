package com.yedam.lhw.classes.abstractPkg;

public class AnimalExample {
	public static void main(String[] args) {
//			Animal animal = new Animal(); 
//			추상 클래스는 직접 인스턴스를 생성 못함
		Cat cat = new Cat();
		cat.sound();
		cat.breathe();

		Dog dog = new Dog();
		dog.sound();
		dog.breathe();

		Animal animal = null;
		animal = cat;
		animal.sound();

		animal = dog;
		animal.sound();

		System.out.println("=========================");
		animalSound(cat);
		animalSound(dog);
		}

	static void animalSound(Animal animal) {
		animal.sound();
	}

}
