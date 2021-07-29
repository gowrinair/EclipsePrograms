package Arrays;

import java.util.Scanner;

public class Q8 {
	 //elements of an array present on even position
	public static void main(String[] args) {
		int a[]= {5,10,15,20,25};
		System.out.println("Array elements in even position:- ");
		for(int i=0;i<a.length;i=i+2) {
			System.out.println("Element at "+i+" position :"+a[i]);
		}
		
	}

}
