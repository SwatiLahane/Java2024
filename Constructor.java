package firstpackage;

public class Constructor 
{   
	
	Constructor() //non parameterised Constructor 
	{
		System.out.println("This is a Constructor");
	}
	Constructor(int a) //Constructor overloading
	{
		System.out.println("This is a Constructor with parameter");
	}
	Constructor(int a, double b)
	{
		System.out.println("This is a Constructor with parameter");
	}
	void Add() // non static method
	{
		System.out.println("Non static method");
	}
    public static void main(String arg[])
    {
    	//Constructor cobj = new Constructor();
    
    	new Constructor(); //we can create an object like this also 
    	new Constructor(10);
    	new Constructor().Add();//we can call nonstatic method like this also
    	Constructor cobj = new Constructor(19,3.14);
        cobj.Add();
    }
}
