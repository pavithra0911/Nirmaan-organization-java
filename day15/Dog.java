package day15;

import day13.main;

public class Dog implements IAnimal {

	@Override
	public void move() {
		System.out.println("Dog run four legs");
		
	}
	@Override
	public void Speak() {
		System.out.println("Dog says woff");
	}
public static void main(String[] args) {
	Dog dog=new Dog();
	dog.move();
	dog.Speak();
	System.out.println( IAnimal.isMammal("dog"));
}

}
