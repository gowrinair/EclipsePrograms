package DataStructures;

import java.util.Scanner;

public class LinearSearch2 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.of elements: ");
		int n=sc.nextInt();
		int a[]=new int [n];
		int i,j;
		System.out.println("Enter the elements : ");
		for(i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the key: ");
		int k=sc.nextInt();
		
		for(j=0;j<n;j++)
		{	if(a[j]==k)
			{	
				System.out.println("Element at position  "+j);
				break;
			}
				
		}
		if(j==n)
			System.out.println("Element not found!");
		
		
	}

}
