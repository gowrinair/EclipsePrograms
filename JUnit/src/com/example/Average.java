package com.example;

import java.util.Scanner;

public class Average {
	
	public static int average() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter N: ");
		int N=sc.nextInt();
		System.out.println("Enter "+N+ " numbers: ");
		int sum=0;
		for(int i=0;i<N;i++) {
			int num=sc.nextInt();
			sum=sum+num;
			
		}
		int avg=sum/N;
		return avg;
		
	}

}
