package Loops_Questions;

import java.util.Scanner;

public class Q3 {
	//sum of n natural numbers
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.of numbers: ");
		int num=sc.nextInt();
		int sum=0;
		for(int i=1;i<=num;i++) {
			sum=sum+i;
		}
		System.out.println("Sum of "+num+" natural numbers is: "+sum);
	}

}
