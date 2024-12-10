package day13;

import java.util.Scanner;

public class main {
	public static void main(String arg[]) {
		Book book=new Book();
		Scanner sc=new Scanner(System.in);
		boolean isTrue=true;
		while(isTrue) {
			System.out.println("enter your choice");
			System.out.println("enter 1 for add or update book details");
			System.out.println("enter 2 for display book details");
			System.out.println("enter 0 for exit");
			int key=sc.nextInt();
			sc.nextLine();
			switch(key) {
			case 1:
			{
				System.out.println("enter the book name:");
				String bookname=sc.nextLine();
				book.setBookName(bookname);
				System.out.println("enter the book author:");
				String bookauthor=sc.nextLine();
				book.setBookAuthor(bookauthor);
				System.out.println("enter the book price:");
				double bookprice=sc.nextDouble();
				book.setBookPrice(bookprice);
				System.out.println("enter the no of copies want:");
				int noofcopies=sc.nextInt();
				book.setNoofCopies(noofcopies);
				break;
				
			}
			case 2:
			{
				System.out.println(book);
				System.out.println();
				break;
			}
			case 0:{
				isTrue=false;
				System.out.println("thank you");
				break;
			}
			default:
			{
				System.out.println("enter the valid choice:");
				break;
			}
			}
			
		}
	}

}
