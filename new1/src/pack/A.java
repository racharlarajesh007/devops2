package pack;

public class A {

	B b1;
	public A(){
	System.out.println("A class const");
	}
	public void setB1(B b1) {
		this.b1=b1;
	}
	
	public void print()
	{
		System.out.println("hello B");
	}
	public void display()
	{
	print();
	b1.print();
	}
}
