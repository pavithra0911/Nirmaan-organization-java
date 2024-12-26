package Ass;

public class Book {
 private String name;
private int numofcopies;
 private double price;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getNumofcopies() {
	return numofcopies;
}
public void setNumofcopies(int numofcopies) {
	this.numofcopies = numofcopies;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
@Override
public String toString() {
	return "Book [name=" + name + ", numofcopies=" + numofcopies + ", price=" + price + "]";
}
public Book(String name, int numofcopies, double price) {
	super();
	this.name = name;
	this.numofcopies = numofcopies;
	this.price = price;
}
public Book() {
	super();
	
}
}