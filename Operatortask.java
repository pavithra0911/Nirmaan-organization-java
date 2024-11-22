package day01;

public class Operatortask {
	public static void main(String args[])
	{
		System.out.println("Arithmatic operation:");
		int firstNum = 12;
		int secondNum = 25;
		int addition=firstNum+secondNum;
		int subtraction=firstNum-secondNum;
		int multiplication=firstNum*secondNum;
		int division=firstNum/secondNum;
		int modulus=firstNum%secondNum;
		
	
		System.out.println("Addition:"+addition);
		System.out.println("subtraction:"+subtraction);
		System.out.println("multiplication:"+multiplication);
		System.out.println("division:"+division);
		System.out.println("modulus:"+modulus);
	




		
		
		System.out.println("Relation operator");
		boolean a=firstNum>secondNum;
		System.out.println("12>25:"+a);
		boolean b=firstNum<secondNum;
		System.out.println("12<25:"+b);
		boolean c=firstNum>=secondNum;
		System.out.println("12>=25:"+c);
		boolean d=firstNum<=secondNum;
		System.out.println("12<=25:"+d);
		boolean e=firstNum==secondNum;
		System.out.println("12==25:"+e);
		boolean f=firstNum!=secondNum;
		System.out.println("12!=25:"+f);
	}

}