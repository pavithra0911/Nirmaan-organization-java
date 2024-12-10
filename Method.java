package day8;

public class Method {
	String addition(int a,int b,int c) {
		return"Addition:"+(a+b+c);
	}
	
	String addition(int a,int b) {
		return"Addition:"+(a+b);
	}
	int subtraction(int a,int b) {
		return a-b;
		
	}
	void multiplication(int a,int b) {
		System.out.println(a*b);
	}
	public static void main(String args[]) {
		Method md=new Method();
		System.out.println(md.addition(5,15,20));
		System.out.println(md.addition(5,10));
		System.out.println(md.subtraction(40,20));
		md.multiplication(2,6);
		
	}
}
