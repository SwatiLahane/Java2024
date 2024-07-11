package firstpackage;

public class LocalGlobalVariable 
{
	static double d = 3.14; //globle variable
	int no_of_of_days_leap_year  =366;
	static int age ;//default value is 0
	
	static void add()
	{
		int a =100; //local variable
		
	}
	public static void main(String arg[])
	{   
		
		int a = 10; //there is no default value for local variable
		System.out.println(a);
		System.out.println(age);
		//to call nonstatic variable we need we create an object 
		LocalGlobalVariable lobj =  new LocalGlobalVariable();
		System.out.println(lobj.no_of_of_days_leap_year); 
		
	
	}

	
	
}
