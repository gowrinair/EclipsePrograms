package Arrays;

import java.util.Scanner;

public class Concepts {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str[]= {"hello","hai","help"};
		System.out.println("Enter a letter to replace: ");
		char ch=sc.next().charAt(0);
		System.out.println("Enter another letter to add on: ");
		char ch1=sc.next().charAt(0);
		int len=str.length;
		String newString="";
		char n = 0;
		String temp;
		for(int i=0;i<len;i++) {
			temp=str[i];
			for(int j=0;j<len;j++) {
				if(ch==temp.charAt(j)) {
					 n=temp.charAt(j);
					 newString=temp.replace(n,ch1);
				}
			}
			
		System.out.println(newString);
		}

	}

}
