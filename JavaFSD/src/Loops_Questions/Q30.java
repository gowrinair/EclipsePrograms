package Loops_Questions;

import java.util.Scanner;

public class Q30 {
	//Transpose of a matrix
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.of columns: ");
		int m=sc.nextInt();
		System.out.println("Enter the no.of rows: ");
		int n=sc.nextInt();
		int i,j,b;
		int mat1[][]=new int[m][n];
		int mat2[][]=new int[m][n];
		System.out.print("Enter Elements of matrix : ");
	       for(i=0; i<m; i++)
	       {
	           for(j=0; j<n; j++)
	           {
	               mat1[i][j] = sc.nextInt();
	           }
	       }
		System.out.println("Hello");   
		for(i = 0;i<m;i++){
	         for(j = 0;j<n;j++){
	            
	        	 mat2[i][j] = 0;
	            //for(int k = 0;k<=n;k++){
	               mat2[i][j]=mat1[j][i];
	           // }
	            System.out.print(mat2[i][j]+" ");
	         }
	         //System.out.println();
	      }
	}

}
