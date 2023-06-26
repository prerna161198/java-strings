package com.string.test;
import java.util.Scanner;

public class PalindromeExample {

	public static void main(String[] args) {
		

	
				Scanner scan=new Scanner(System.in);
				
				System.out.println("Enter a string:");
				String s=scan.nextLine();
				
				String rev="";
				
				for(int i=s.length()-1;i>=0;i--)
				{
					rev=rev+s.charAt(i);
				}
				
				
				if(s.equals(rev))
				{
					System.out.println("It's a palindrome String");
				}
				else
				{
					System.out.println("It's not a palindrome string");
				}
			}

		

	}


