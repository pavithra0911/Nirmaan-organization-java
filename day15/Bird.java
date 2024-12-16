package day15;

public class Bird implements IAnimal {

	@Override
	public void move() {
	System.out.println("the bird files in the sky");
		
	}
	@Override
	public void Speak() {
	System.out.println("the bird says chirp chirp");
		
	}
	public static void main(String[] args) {
		Bird bird=new Bird();
		bird.move();
		bird.Speak();
		System.out.println( IAnimal.isMammal("bird"));
	}


}
