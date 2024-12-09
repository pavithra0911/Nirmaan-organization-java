package day10;

public class Main {
	public static void main(String args[]) {
		Car car1=new Car();
		car1.displayCarDetails();
		Car car2=new Car("BMW");
		car2.displayCarDetails();
		Car car3=new Car("BMW",1999);
		car3.displayCarDetails();
		Car car4=new Car(1998,"AUDI");
		car4.displayCarDetails();
	}}
