package day15;

public class Human implements IAnimal {

	@Override
	public void move() {
		System.out.println("human run on two legs");
	
}
@Override
public void Speak() {
System.out.println("speak");
	
}
public static void main(String[] args) {
	Human human=new Human();
	human.move();
	human.Speak();
	System.out.println( IAnimal.isMammal("human"));
}
	}
	


