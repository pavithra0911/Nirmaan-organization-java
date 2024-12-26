package Ass;
import java.util.ArrayList;
import java.util.Scanner;
public class main {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
	
		Book b=new Book();
	
		ArrayList<Book> al=new ArrayList<Book>();
		boolean isTrue=true;
		while(isTrue) {
		System.out.println("enter your choice");
		System.out.println("1 for add");
		System.out.println("2 for update");
		System.out.println("3 for show");
		System.out.println("0 for exit");
		  
		int key=sc.nextInt();
		sc.nextLine();
		
		
		if(key==1) {
			System.out.println("enter your book name:");
			String select=sc.nextLine();
			System.out.println("enter the noofcopies:");
			int i=sc.nextInt();
			System.out.println("enter the price:");
			double d=sc.nextDouble();
			b=new Book(select, i, d);
			al.add(b=new Book(select, i, d));
		}
			else if(key==2) {
				System.out.println("enter your book name:");
				String select=sc.nextLine();
				for(Book b1:al) {
					if(select.equalsIgnoreCase(b1.getName()));{
						System.out.println("rename your bookname");
						String name=sc.nextLine();
						b1.setName(name);
					}
				}
				System.out.println("enter the noofcopies:");
				int i=sc.nextInt();
				b.setNumofcopies(i);
				System.out.println("enter the price:");
				double d=sc.nextDouble();
				b.setPrice(d);
			}
			else if(key==3) {
				System.out.println(al); 
			}
			else {
				isTrue=false;
				System.out.println("enter correct choice:");
			}
		
		
		
		
	}

}}
