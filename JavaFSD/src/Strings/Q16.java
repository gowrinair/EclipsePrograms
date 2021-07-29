package Strings;

import java.util.Scanner;

public class Q16 {
	public static void main(String[] args) {
		//Reverse a string
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s=sc.nextLine();
		
		StringBuilder s1=new StringBuilder();
		s1.append(s);
		s1.reverse();
		System.out.println("The reversed string: "+s1);
		
		int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
		int x = myNumbers[1][2];
		System.out.println(x);

		
	}
	
/* Another method to reverse the string:	
	String string = "Dream big";    
    //Stores the reverse of given string    
    String reversedStr = "";    
        
    //Iterate through the string from last and add each character to variable reversedStr    
    for(int i = string.length()-1; i >= 0; i--){    
        reversedStr = reversedStr + string.charAt(i);    
    }    
        
    System.out.println("Original string: " + string);    
    //Displays the reverse of given string    
    System.out.println("Reverse of given string: " + reversedStr);    
}    */
	
	
	 



}
