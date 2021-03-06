package DataStructures;

import java.util.Scanner;

public class Search_Sort {
	
	
	public static  int search(int[] a,int k) {
		
		for(int i=0;i<a.length;i++)
		{	if(a[i]==k)
				return i;
		}
		
		return -1;
	}
	
	public static void sort() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no.of elemets in the array: ");
		int n=sc.nextInt();
		int array[]=new int[n];
		System.out.println("Enter "+n+ " elements to sort: ");
		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();
		}
			
		 int temp = 0;  
         for(int i=0; i < n; i++){  
            for(int j=1; j < (n-i); j++){  
                if(array[j-1] > array[j]){  
                     temp = array[j-1];  
                     array[j-1] = array[j];  
                     array[j] = temp;
                      
                }  
                               
             } 
         } 
         
         System.out.println("Array after bubble sort: ");
         for(int i=0;i<n;i++) {
        	 System.out.print(array[i]+" ");
         }
	}
	
	public static void main(String[] args) {
		int []a= {1,2,3,4,5,6,7};
		int k=2;
		
		System.out.println("The array is: ");
		 for(int i=0;i<a.length;i++) {
        	 System.out.print(a[i]+" ");
         }
		int ans=search(a,k);
		if(ans!=-1)
			System.out.println("\nThe item " +k+ " is found in "+ans);
		else 
			System.out.println("\nThe item "+k+" not found!");
		
		
		sort();
	}
	
	

}
