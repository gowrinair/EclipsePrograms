package OOPS;

import java.util.Scanner;

public class Transportation {
	
	String mode;
	int num;
	String destination;
	double totalCost;
	String name;
	Scanner sc=new Scanner(System.in);
	
	void modeOfTransportation() {
		System.out.println("Travel Agency Cost Calculation System");
		System.out.println("Enter your name: ");
		String name=sc.next();
		System.out.println("Enter your mode of transportation: \n1.Roadways \n2.Airways\n3.Railways ");
		 mode=sc.next();
		System.out.println("Enter your destination:(Delhi/Calicut/Mumbai) ");
		destination=sc.next();
		System.out.println("Enter the no.of persons: ");
		num=sc.nextInt();
		switch(mode) {
		case "Roadways": RoadCost(num,destination);
					 break;
		case "Airways": AirCost(num,destination);
		             break;
		case "Railways":TrainCost(num,destination);
					break;
		default: System.out.println("Enter valid input!");
				break;
		}
	}
	
	double RoadCost(int num,String destination) {
		totalCost=0;
		if(destination.equalsIgnoreCase("delhi"))
		{	totalCost=1000*num;
			System.out.println("Total cost for "+num+ "person :"+totalCost);
		}
		else if(destination.equalsIgnoreCase("calicut"))
		{
			totalCost=500*num;
			System.out.println("Total cost for "+num+ "person :"+totalCost);
		}
		else if(destination.equalsIgnoreCase("mumbai")) {
			totalCost=1500*num;
			System.out.println("Total cost for "+num+ "person :"+totalCost);
		}
		else
			System.out.println("Enter valid destination!");
		return totalCost;
	}
	
	double AirCost(int num,String destination) {
		totalCost=0;
		if(destination.equalsIgnoreCase("delhi"))
		{	totalCost=2000*num;
			System.out.println("Total cost for "+num+ "person :"+totalCost);
		}
		else if(destination.equalsIgnoreCase("calicut"))
		{
			totalCost=1000*num;
			System.out.println("Total cost for "+num+ "person :"+totalCost);
		}
		else if(destination.equalsIgnoreCase("mumbai")) {
			totalCost=2500*num;
			System.out.println("Total cost for "+num+ "person :"+totalCost);
		}
		else
			System.out.println("Enter valid destination!");
		return totalCost;
	}
	
	
	double TrainCost(int num,String destination) {
		totalCost=0;
		if(destination.equalsIgnoreCase("delhi"))
		{	totalCost=1500*num;
			System.out.println("Total cost for "+num+ "person :"+totalCost);
		}
		else if(destination.equalsIgnoreCase("calicut"))
		{
			totalCost=900*num;
			System.out.println("Total cost for "+num+ "person :"+totalCost);
		}
		else if(destination.equalsIgnoreCase("mumbai")) {
			totalCost=1700*num;
			System.out.println("Total cost for "+num+ "person :"+totalCost);
		}
		else
			System.out.println("Enter valid destination!");
		return totalCost;
	}
	
	
	
}

