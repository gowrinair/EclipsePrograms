package Week1_Programs;

public class Q3_swap_withoutTemp {
	
	public static void main(String[] args) {
		int a=50;
		int b=20;
		System.out.println("a: "+a+" and  b: "+b);
		//swapping
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping:");
		System.out.println("a: "+a+" and  b: "+b);
	}

}
