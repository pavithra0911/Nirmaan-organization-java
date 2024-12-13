package day14;
import java.util.Scanner;

public class UserInterface {
	public static void main(String args[]) {
		Calculator calc=new Calculator();
		Scanner sc=new Scanner(System.in);
		
		
		int a=10;
		int b=30;
		System.out.println("ADDITION :");
		System.out.println(calc.add(a, b));
		System.out.println("SUBTRACTION :");
		System.out.println(calc.sub(a, b));
		System.out.println("MULTIPLICATION :");
		System.out.println(calc.mul(a, b));
		System.out.println("DIVISION :");
		System.out.println(calc.div(a, b));
	}

}
