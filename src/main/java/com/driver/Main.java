package com.driver;

 class A 
 {
   public string meth()
    {
       return " invoking method from class A" ;   	
    }	 
 }
class B extends  A
{  
	@override
	public string meth()
	{
		return "method is overridden in class B";
	}
       
}
public class Main 
{
	public static void main(String [] args)
	{
		B object=new B();
	       object.meth();
	       
	       B object1=new B();
	       object2.meth();
	}
	
	
}