package Loops_Questions;

import java.util.Scanner;

public class Q4 {
	
	public static void main(String args[])
	  {
		//factorial program 
		Scanner sc=new Scanner(System.in);
	    int n,c,f=1;
	    System.out.println("Enter the number: ");
	    n = sc.nextInt();
	    if (n < 0)
	      System.out.println("Number should be non-negative.");
	    else
	    {
	      for(c=1;c<=n;c++)
	        f = f*c;
	      	System.out.println("Factorial of "+n+": "+f);
	    }
	  }

}
