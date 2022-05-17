package day2;

public class A {

	int a;//global
	int b;
	
	A(int a, int b) //3,6
	{
		this.a=a; //a = 3 b=6
		this.b=b;
	}
	
	A()
	{
		System.out.println("inside");
	}
	
	// object constructor
	
}

class B
{
	public static void main(String[] args) {
		
		A j = new A();
		j.a=5;
		j.b=6;
		
		System.out.println(j.a);
		System.out.println(j.b);
		System.out.println("inside");
		
		A s = new A(3,65);
		System.out.println(s.a);
		System.out.println(s.b);
		
		System.out.println("inside");
		
		
	}
}