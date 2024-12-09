package day04;
import java.util.Scanner;


public class Ifstatement {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("0 for add:");
		System.out.println("1 for del:");
		System.out.println("2 for multi:");
		System.out.println("3 for div:");
		System.out.println("4 for mod:");
		int key=sc.nextInt();
		System.out.println("enter your first number");
		int firstNum=sc.nextInt();
		System.out.println("enter your second number");
		int secondNum=sc.nextInt();
		if(key==0) { 
			int total=firstNum+secondNum;
			System.out.println("Addition:"+total);
			
			
		}
		else if(key==4) { 
			int total=firstNum%secondNum;
			System.out.println("modulus:"+total);
			}
		else if(key==1) { 
			int total=firstNum-secondNum;
			System.out.println("subtraction:"+total);
			}
		else if(key==2) { 
			int total=firstNum*secondNum;
			System.out.println("multiplication:"+total);
			}
		else if(key==3) { 
			int total=firstNum/secondNum;
			System.out.println("division:"+total);
			} 
		
		switch(key) 
		{
		case 0:{
			int total=firstNum+secondNum;
			System.out.println("Addition:"+total);
			break;
			}
	case 1:{
		int total=firstNum-secondNum;
		System.out.println("subtraction:"+total);
		break;
		}
case 2:{
	int total=firstNum*secondNum;
	System.out.println("multiplication:"+total);
	break;
	}
   case 3:{
	int total=firstNum/secondNum;
	System.out.println("division:"+total);
	break;
	}
	case 4:
		int total=firstNum%secondNum;
		System.out.println("modulus:"+total);
		break;
		}
		
		
	sc.close();
	
	


	
		
	}}


