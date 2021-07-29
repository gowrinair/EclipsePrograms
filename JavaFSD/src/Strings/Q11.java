package Strings;

import java.util.Scanner;

public class Q11 {
	public static void main(String[] args) {
		//lower to uppercase
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s1=sc.nextLine();
		String s2=s1.toUpperCase();
		System.out.println("uppercase: "+s2);
		String s3=s1.toLowerCase();
		System.out.println("lowercase: "+s3);
		
	}

}
