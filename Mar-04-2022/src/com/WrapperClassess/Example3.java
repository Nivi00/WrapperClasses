package com.WrapperClassess;

public class Example3 
{

	
	public static void main(String[] args) 
	{
		
		Short rank = 21;
		
		
		Short b1 = Short.valueOf(rank);
		
		System.out.println(b1);	
		
		System.out.println("===========================");
		
		
		Short myAge = 20;
		Short age = new Short(myAge);
		
		
		Short age1 = age;
		
		System.out.println(age1);

	}

}
