package com.example;

import java.util.Scanner;

public class Age {
	
	public static String age() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age: ");
		int age=sc.nextInt();
		String a;
		if(age<18)
			 a="child";
		else if(age>=18&&age<30)
			 a="Youth";
		else if(age>=30&&age<60)
			a="Adult";
		else
			a="Senior citizen";
		return a;
	}
	
	}


