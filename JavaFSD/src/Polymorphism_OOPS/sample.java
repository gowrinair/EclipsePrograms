package Polymorphism_OOPS;

public class sample {
	
	public static void main(String[] args) {
		A ob=new A();
		ob.sum(20, 20);
		
	}

}
class A{
	void sum(int a,long b) {
		System.out.println(a+b);
	}
	void sum(int a,int b,int c) {
		System.out.println(a+b+c);
	}
}

