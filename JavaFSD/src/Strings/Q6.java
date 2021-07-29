package Strings;

import java.util.Scanner;

public class Q6 {
	public static void main(String[] args) {
		//divide a string in 'N' equal parts.
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s=sc.nextLine();
		System.out.println("Enter N: ");
		int N=sc.nextInt();
		int len=s.length();
		int temp=0;
		String[] newString=new String[N];
		int parts=len/N;
		if(len%N==0) {
			for(int i=0;i<len;i=i+parts) {
				String sub = s.substring(i, i+parts);  
                newString[temp] = sub;  
                temp++;  
			}
			System.out.println("Subparts: ");
			for(int i = 0; i < N; i++) {  
	            System.out.println(newString[i]);  
	            }  
			
		}
		else
			System.out.println("Cannot be divided..Enter a diff N");
		
	}

}
