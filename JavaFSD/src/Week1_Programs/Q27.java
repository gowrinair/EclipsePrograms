package Week1_Programs;

import java.util.Scanner;

public class Q27 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int num1=sc.nextInt();
		System.out.println("Enter the second number: ");
		int num2=sc.nextInt();
		sc.close();
		int sum=num1+num2;
		if(sum>0)
			System.out.println("Average is:"+sum/2);
		else
			System.out.println("Invalid input!");
		
	}

}
