package DataStructures;

import java.util.Scanner;

public class BubbleSort {
	
	
	public static void main(String[] args) {
		BubbleSort ob=new BubbleSort();
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
		 int temp = 0;  
         for(int i=0; i < n; i++){  
            for(int j=1; j < (n-i); j++){  
                if(a[j-1] > a[j]){  
                     temp = a[j-1];  
                     a[j-1] = a[j];  
                     a[j] = temp;
                      
                }  
                               
             } 
         } 
         
         System.out.println("Array after bubble sort: ");
         for(int i=0;i<n;i++) {
        	 System.out.print(a[i]+" ");
         }
        	 
         
	}

}
