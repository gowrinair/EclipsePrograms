package Loops_Questions;

import java.util.Scanner;

public class Q28 {
	//Addition of 2 matrices
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.of columns: ");
		int m=sc.nextInt();
		System.out.println("Enter the no.of rows: ");
		int n=sc.nextInt();
		int i,j;
		int mat1[][]=new int[m][n];
		int mat2[][]=new int[m][n];
		int mat3[][]=new int[m][n];
		
		System.out.print("Enter Elements of 1st matrix : ");
	       for(i=0; i<m; i++)
	       {
	           for(j=0; j<n; j++)
	           {
	               mat1[i][j] = sc.nextInt();
	           }
	       }
		   
	       System.out.print("Enter Elements of 2nd matrix : ");
	       for(i=0; i<m; i++)
	       {
	           for(j=0; j<n; j++)
	           {
	               mat2[i][j] = sc.nextInt();
	           }
	       }
	       //Addition
	       for(i=0; i<m; i++)
	       {
	           for(j=0; j<n; j++)
	           {
	               mat3[i][j] = mat1[i][j] + mat2[i][j];
	           }
	       }
		 
	       System.out.println("Resultant matrix: ");
	       for(i=0; i<m; i++)
	       {
	           for(j=0; j<n; j++)
	           {
	               System.out.print(mat3[i][j]+ " ");
	           }
	           System.out.println();
	       }
		
		
	}

}
