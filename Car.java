package day10;

public class Car {
	String make;
	int year;
	//No Arguments
	Car(){
		this.make="unknow";
		this.year=2000;
		
	}
	//SINGLE PARAMETER
	Car(String make){
		this.make=make;
		this.year=2000;
	}
	//TWO PARAMETER
	Car(String make,int year){
		this.make=make;
		this.year=year;
	}
	//TWO PARAMETER WITH DIFFERENT ORDER
Car(int year,String make){
	this.make=make;
	this.year=year;
}
void displayCarDetails() {
	System.out.println("make:"+make);
	System.out.println("year:"+year);
}

	
}
	

