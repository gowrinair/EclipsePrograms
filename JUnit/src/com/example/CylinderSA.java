package com.example;

import java.util.Scanner;

public class CylinderSA {
	
	public static int SurfaceArea() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the side: ");
		int s=sc.nextInt();
		int SA=6*s*s;
		return SA;
		
	}

}
