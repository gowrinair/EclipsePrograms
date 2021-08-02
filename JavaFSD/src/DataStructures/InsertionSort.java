package DataStructures;

import java.util.Scanner;

public class InsertionSort {
	public static void main(String[] args) {
		
		InsertionSort ob=new InsertionSort();
		ob.sort();
	}
		

	
	public void sort() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no.of elemets in the array: ");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter "+n+ " elements to sort: ");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
		for (int i= 1;i< n;i++) {
		      int key = a[i];
		      int j = i- 1;

		    
		      while (j >= 0 && key < a[j]) {
		        a[j + 1] = a[j];
		        --j;
		      }

		      a[j + 1] = key;
		 }
		System.out.println("Elements after insertion sort: ");
		for(int i=0;i<n;i++)
			System.out.print(a[i]+ " ");

	}

}