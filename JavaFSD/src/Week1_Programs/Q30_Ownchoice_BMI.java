package Week1_Programs;

import java.util.Scanner;

public class Q30_Ownchoice_BMI {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your weight in kg: ");
		double weight=sc.nextDouble();
		System.out.println("Enter your height in m: ");
		double height=sc.nextDouble();
		System.out.println("Enter your gender: ");
		String gender=sc.next();
		double bmi;
		sc.close();
		if(weight==0||height==0) {
			System.out.println("Please enter valid inputs!");
		}
		else {
			switch(gender) {
			case "female": bmi=weight/(height*height);
							if(bmi<=18.4)
								System.out.println("Underweight");
							else if(bmi>=18.5&&bmi<=24.9)
								System.out.println("Normal weight");
							else if(bmi>=25&&bmi<=29.9)
								System.out.println("Overweight");
							else
								System.out.println("Obese");
							break;
			case "male": bmi=weight/(height*height);
						if(bmi<=18.4)
							System.out.println("Underweight");
						else if(bmi>=18.5&&bmi<=24.9)
							System.out.println("Normal weight");
						else if(bmi>=25&&bmi<=29.9)
							System.out.println("Overweight");
						else
							System.out.println("Obese");
						break;
				
			}
			
		}
			
	}

}
