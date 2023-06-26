



	
		package com.string.test;

		public class StringMethods1 {

			public static void main(String[] args) {
			  //isBlank() - returns true if the specified string object contains no value or only whitespace characters otherwise false.
			  //isEmpty() -	returns true if the length of the string is 0 otherwise false.
		       
				String st1,st2;
				st1=" ";
				
				System.out.println(st1.isBlank());//does not contain any value 
				System.out.println(st1.isEmpty());// length 
				
				
				//trim : removes extra spaces from the leading and trailing position of the given string
				
				String name="  Raman Shah   ";
				
				System.out.println(name);
				System.out.println(name.trim());
				
				//replace : It replace
				String username="Raman Shah";
				String para="It is a tall building. It is build in 1990.";
				System.out.println(username.replace("Shah","Roy"));
				
				
				//replace all
				System.out.println(para);
				System.out.println(para.replaceAll("is", "was"));
				
				
				//split
				String array[]=para.split(" ");
				
				for(String element:array)//advanced for loop
				{
					System.out.println(element);
				}
				
				System.out.println("============================");
				
				String names="aman, raman, kumar, rohini, shalini"; 
				String namesArray[]=names.split(", ");
				
						
				for(int i=0;i<namesArray.length;i++)
				{
					System.out.println(namesArray[i]);
				}
				
				String st=null;
				//System.out.println(st.length()); //NullPointerException
				
				String str="  ";
				System.out.println(str.length());
				
				
				System.out.println("============================");
				
				String str1="java@programming@java";
				String ar[]=str1.split("@");
				
				for(int i=0;i<ar.length;i++)
				{
					System.out.println(ar[i]);
				}
				
				
				System.out.println("============================");
				str1="javaprogrammingjava";
				ar=str1.split("a");
				
				for(int i=0;i<ar.length;i++)
				{
					System.out.println(ar[i]);
				}
				
				System.out.println("============================");
				
				names="aman, rohan shalini@kumar.mohan&kusum";
				ar=names.split("[, @.&]+");
				for(int i=0;i<ar.length;i++)
				{
					System.out.println(ar[i]);
				}
			}

		

	}


