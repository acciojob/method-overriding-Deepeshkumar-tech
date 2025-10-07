package com.driver;

public class Main 
{
	 class A 
	 {
	   public static String meth()
	    {
	       return "invoking method from class A" ;   	
	    }	 
	 }
	class B extends  A
	{  
		//@override
		public static String meth()
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