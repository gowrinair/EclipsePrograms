package Week1_Programs;

public class Q2_swap_usingTemp {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		int temp;
		System.out.println("a: "+a+" and  b: "+b);
		//swapping
		temp=a;
		a=b;
		b=temp;
		System.out.println("After swapping:");
		System.out.println("a: "+a+" and  b: "+b);
		
	}

}
