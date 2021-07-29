package Loops_Questions;

import java.util.Scanner;

public class Q15 {
	//Average Marks'
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double sum=0;		
		System.out.println("Enter the no.of subjects: ");
		int num=sc.nextInt();
		System.out.println("Enter the marks for each subjects: ");
		for(int i=1;i<=num;i++) {
			double mark=sc.nextDouble();
			sum=sum+mark;
		}
		double avg=sum/num;
		System.out.println("Average of marks for "+num+" subjects: "+avg);
	}

}
