package OOPS;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st string: ");
		String s1=sc.next();
		System.out.println("Enter the 2nd string: ");
		String s2=sc.next();
		System.out.println("Concatenation: "+concat(s1, s2));
		System.out.println("Substring: "+subString(s1));
		System.out.println("Replacing: "+replace(s2));
		System.out.println("lower case :"+LowerCase(s1));
		System.out.println("Reversal: "+reverse(s2));
		
	}
	public static String concat(String s1,String s2) {
		String newStr=s1+s2;
		return newStr;
	}
	public static String subString(String s1) {
		String newStr=s1.substring(2);
		return newStr;
	}
	public static String replace(String s2) {
		String newStr=s2.replace(s2.charAt(2),'0');
		return newStr;
	}
	public static String LowerCase(String s1) {
		String newStr=s1.toLowerCase();
		return newStr;
	}
	public static String reverse(String s2) {
		String newStr="";
		 for(int i = s2.length()-1; i >= 0; i--){    
			  newStr = newStr + s2.charAt(i);   
	      }    
		 return newStr;
		
	}
	
		
}
