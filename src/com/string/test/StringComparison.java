package com.string.test;

public class StringComparison {

	public static void main(String[] args) {
		

		

			
				
				String s1="Java";
				String s2="JAVA";
				String s3="Java";
				
				System.out.println(s1.equals(s2));
				System.out.println(s1.equals(s3));
				System.out.println(s1.equalsIgnoreCase(s2));
				
				
				String s4=new String("Java");
				
				System.out.println(s1==s4);
				System.out.println(s1==s3);
				
				
				System.out.println(s1.compareTo(s4));
				System.out.println(s1.compareTo(s2));
				System.out.println(s2.compareTo(s1));
			}

		

	}


