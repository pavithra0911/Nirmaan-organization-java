package day15;
import java.util.Scanner;
public class IndianBank {
	public static void main(String[] args) {
		System.out.println("enter your pin:");
		Scanner sc=new Scanner(System.in);
		int pin=sc.nextInt();
		Bank b=new Bank();
		boolean isTrue=true;
		while(isTrue) {
			if(b.getPin()==pin) {
				System.out.println("your current balance is:");
				System.out.println(b.getAccBal());
				System.out.println("enter your choice");
				System.out.println("enter 1 for withdraw");
				System.out.println("enter 2 for deposit");
				System.out.println("enter 3 for showBalance");
				System.out.println("enter 0 for exit");
				int choice=sc.nextInt();
				if(choice==1) {
					System.out.println("enter the withdraw amount:");
					int amt=sc.nextInt();
					System.out.println("your current balance is:");
					System.out.println(b.setAccBal(b.getAccBal())-amt);
					b.setAccBal(b.setAccBal(b.getAccBal())-amt);
				}
				else if(choice==2) {
					System.out.println("enter the deposit amount:");
					int amt=sc.nextInt();
					System.out.println("your current balance is:");
					System.out.println(b.setAccBal(b.getAccBal())+amt);
					b.setAccBal(b.setAccBal(b.getAccBal())+amt);
				}
				else if(choice==3) {
					System.out.println(b);
				}
				else if(choice==0) {
					isTrue=false;
					System.out.println("thank you");
				}
			}
			else {
				isTrue=false;
				System.out.println("enter the correct pin");
			}
		}
		sc.close();
	}

}
