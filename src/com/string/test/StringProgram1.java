



	
		package com.string.test;

		import java.util.Scanner;

		public class StringProgram1 {

			public static void main(String[] args) {
				
				Scanner scan=new Scanner(System.in);
				
				System.out.println("Enter a string:");
				String s=scan.nextLine();
				int alphabet=0,vowels=0,consonants=0,lowerCase=0,upperCase=0,spaces=0,digits=0,special=0;
				
				for(int i=0;i<=s.length()-1;i++)
				{
					if(s.charAt(i)>='0' && s.charAt(i)<='9')
					{
						++digits;
					}
					
					
					else if(s.charAt(i)>='a' && s.charAt(i)<='z')
					{
						lowerCase++;
						if(s.charAt(i)=='a' ||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
						{
							vowels++;
						}
						else
						{
							consonants++;
						}
					}
					else if(s.charAt(i)>='A' && s.charAt(i)<='Z')
					{
						upperCase++;
						if(s.charAt(i)=='A' ||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U')
						{
							vowels++;
						}
						else
						{
							consonants++;
						}
					}
					
					else if(s.charAt(i)==' ')
					{
						spaces++;
					}
					else
					{
						special=special+1;
						
					}
					
				}
				
				
				System.out.println("Alphabets="+(lowerCase+upperCase));
				System.out.println("lowerCase alphabets="+lowerCase);
				System.out.println("UpperCase alphabets="+upperCase);	
				System.out.println("Vowels="+vowels);
				System.out.println("Consonants="+consonants);
				System.out.println("Spaces="+spaces);
				System.out.println("Words="+(spaces+1));
				System.out.println("Digits="+digits);
				System.out.println("Special="+special);
			}

		

	}


