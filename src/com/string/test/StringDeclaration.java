



	
		package com.string.test;

		import org.openjdk.jol.vm.VM;

		public class StringDeclaration {

			public static void main(String[] args) {
				
				String st="Hello World"; //created in constant pool
				System.out.println(VM.current().addressOf(st));
				st="hi";
				System.out.println(VM.current().addressOf(st));
				
				String st1=new String();
				
				
				String st2=new String("Hello World");//created in heap memory
				String st5=new String("Hello World");
				
				
				
				
				
				
				System.out.println(VM.current().addressOf(st2));
				System.out.println(VM.current().addressOf(st5));
				
				
			}

		

	}


