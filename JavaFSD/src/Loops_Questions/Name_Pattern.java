package Loops_Questions;

import java.util.Scanner;

public class Name_Pattern {
	public static void main(String[] args) {
	
		String s="gowri";
		int len=s.length();
		for(int i=0;i<len;i++) {
			for(int j=0;j<len;j++) {
				System.out.print(s.charAt(i)+" ");
			}
			System.out.println();	
		}
	}

}
