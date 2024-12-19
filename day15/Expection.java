package day14;
import java.util.Scanner;


public class Expection {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		try {
			System.out.println("enter your age");
			int age=sc.nextInt();
			if(age>0) {
				System.out.println(age);
			}else {
				throw new ArithmeticException();
				
			}}
		catch(ArithmeticException e) {
			System.out.println("age invalid");
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			System.out.println("always work");
		}
		System.out.println("program finish  ");
	}}



