package com.example;

import java.util.Scanner;

public class LeapYear {
	
	public static String leapYear() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a year: ");
		int year=sc.nextInt();
		String a;
		if(((year % 4 ==0) && (year % 100 !=0)) || (year % 400==0)){
			a="Leap year";
		}
		else {
			a="Common year";
		}
		return a;
	}
	

}
