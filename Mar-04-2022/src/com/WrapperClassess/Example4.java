package com.WrapperClassess;

public class Example4 
{

	
	public static void main(String[] args) 
	{
		boolean valid = true;
		
		boolean status = Boolean.valueOf(valid);
		
		System.out.println(status);
		
		System.out.println("=============");
		
		boolean invalid = new Boolean(false);
		
		boolean comment = invalid;
		
		System.out.println(invalid);
	}
}

		
		
		
	