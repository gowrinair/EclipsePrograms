package com.example;

import java.util.Scanner;

public class CirclePerimeter {

	
	public static int Perimeter() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius: ");
		double r=sc.nextDouble();
		int perimeter=(int) (2*3.14*r);
		return perimeter;
	}
}
