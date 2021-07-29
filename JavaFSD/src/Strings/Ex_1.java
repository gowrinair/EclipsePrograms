package Strings;

public class Ex_1 {
	   public static void main(String args[]) {
		      char[] helloArray = { 'h', 'e', 'l', 'l', 'o', '.' };
		      String helloString = new String(helloArray);  
		      System.out.println( helloString );
		      
		      String palindrome = "Dot saw I was Tod mama";
		      int len = palindrome.length();
		      System.out.println( "String Length is : " + len );
		      
		      String string1 = "saw I was ";
		      System.out.println("Dot " + string1 + "Tod");
		      
		      String fs;
		      float floatVar=10;
		      int intVar=2;
		      String stringVar="hello";
		      fs = String.format("The value of the float variable is " +
	                   "%f, while the value of the integer " +
	                   "variable is %d, and the string " +
	                   "is %s", floatVar, intVar, stringVar);
		      System.out.println(fs);



		}

		  
}
