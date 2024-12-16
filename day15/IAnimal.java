package day15;

public interface IAnimal{
	String livingBeign="Animal";
	
	static boolean isMammal(String animalName) {
		return(animalName.equalsIgnoreCase("Dog"))||(animalName.equalsIgnoreCase("Cat"))||(animalName.equalsIgnoreCase("human"));
		
	}
default void Speak() {
	System.out.println("Animal is a making sound");
}
public void move();
}
