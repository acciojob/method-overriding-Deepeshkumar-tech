package com.driver;

public class Main 
{
	 class A 
	 {
	   public string meth()
	    {
	       return " invoking method from class A" ;   	
	    }	 
	 }
	class B extends  A
	{  
		//@override
		public string meth()
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