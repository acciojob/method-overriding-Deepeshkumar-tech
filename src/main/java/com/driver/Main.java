package com.driver;

public class Main 
{
	static class A 
	 {
	   public  String meth()
	    {
	       return "invoking method from class A" ;   	
	    }	 
	 }
	startic class B extends  A
	{  
		//@override
		public String meth()
		{
			return "method is overridden in class B";
		}
	       
	}
	
	public static void main(String [] args)
	{
		B object=new B();
	       object.meth();
	       
	    B object1=new B();
	       object1.meth();
	}
	
	
}