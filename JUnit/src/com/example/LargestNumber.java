package com.example;



public class LargestNumber {
	
	public static int largestOf3(int a,int b,int c) {
	int largest;
	if(a>=b&&a>=c)
	{	System.out.println("a is largest");
		largest=a;}
	else if (b>c)
	{	System.out.println("b is largest");
		largest=b;}
	else
	{	System.out.println("c is largest");
		largest=c;
	}
	return largest;
}
}
