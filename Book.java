package day13;

public class Book {
	private String bookName;
	private double bookPrice;
	private String bookAuthor;
	private int noofCopies;
	Book(){}
	public double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public int getNoofCopies() {
		return noofCopies;
	}
	public void setNoofCopies(int noofCopies) {
		this.noofCopies = noofCopies;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookName() {
		return bookName;
	}
	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", bookPrice=" + bookPrice + ", bookAuthor=" + bookAuthor
				+ ", noofCopies=" + noofCopies + "]";
	}
	

	

}
