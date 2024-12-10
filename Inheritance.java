package day13;

class Animal{
	public void makeSound() {
		System.out.println("this animal make a sound");
	}
}
class Dog extends Animal{
	@Override
	public void makeSound() {
		System.out.println("the Dog Barks");
		}
	}


class Cat extends Animal{
	@Override
	public void makeSound() {
		System.out.println("the Cat meows");
		}
	}



public class Inheritance { 
	public static void main(String args[]) {
		Dog dog=new Dog();
		Cat cat=new Cat();
		dog.makeSound();
		cat.makeSound();
		
	}

}
