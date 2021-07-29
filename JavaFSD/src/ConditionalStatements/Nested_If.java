package ConditionalStatements;

public class Nested_If {
	public static void main(String[] args) {
		//Creating two variables for age and weight 
		int age=20;
		int weight=80;
		if(age>=18) {
			if(weight>50) {
				System.out.println("Eligible to donate blood");
			}
		}
	}


}
