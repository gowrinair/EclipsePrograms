package OOPS;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a: ");
		int a =sc.nextInt();
		System.out.println("Enter b: ");
		int b=sc.nextInt();
		System.out.println("Sum :"+sum(a, b));
		System.out.println("Subtraction: "+minus(a, b));
		System.out.println("Multiplication: "+multiply(a, b));
		System.out.println("Division: "+divide(a, b));
		System.out.println("Remainder: "+modulus(a, b));
		
	}
	public static double sum(double x,double y)
	{
		double c=x+y;
		return c;
	}
	public static double minus(double x,double y)
	{
		double c=x-y;
		return c;
	}
	
	public static double multiply(double x,double y)
	{
		double c=x*y;
		return c;
	}
	public static double divide(double x,double y)
	{
		double c=x/y;
		return c;
	}
	public static double modulus(double x,double y) {
		double c=x%y;
		return c;
	}

}
