package DataStructures;

import java.util.Scanner;

public class SelectionSort {
	
	public static void main(String[] args) {
		SelectionSort ob=new SelectionSort();
		ob.sort();
		
	}
	
	public void sort() {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no.of elements in the array: ");
		int n=sc.nextInt();
		
		int a[]=new int[n];
		
		System.out.println("Enter "+n+ " elements to sort: ");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<n-1;i++)
		{
			int MIN=i; 
			for(int j=i+1;j<n;j++)
			{
				if(a[j]<a[MIN]){
					MIN=j;
				}
			}
			//Swap
			int temp=a[i];
			a[i]=a[MIN];
			a[MIN]=temp;
		}
		System.out.println("Elements after sorting: ");
		for(int i=0;i<n;i++)
			System.out.print(a[i]+ " ");
	}
}
