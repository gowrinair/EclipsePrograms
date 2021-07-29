package Week1_Programs;

import java.util.Scanner;

public class Q29 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age: ");
		int age=sc.nextInt();
		sc.close();
		if(age<18)
			System.out.println("Child");
		else if(age>=18&&age<30)
			System.out.println("Youth");
		else if(age>=30&&age<60)
			System.out.println("Adult");
		else
			System.out.println("Senior citizen");
	}
}
