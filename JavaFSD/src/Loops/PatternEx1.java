package Loops;

import java.util.Scanner;

public class PatternEx1 {
	//5by5 * pattern
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.of columns: ");
		int m=sc.nextInt();
		System.out.println("Enter the no.of rows: ");
		int n=sc.nextInt();
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
	}

}
