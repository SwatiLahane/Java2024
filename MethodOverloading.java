package firstpackage;

public class MethodOverloading 
{
	
  static void Add() //static method
  {
	  
	  System.out.println("1");
  }
   void Add(int a)  //nonstatic method
  {   
	  System.out.println("2");
	  System.out.println(a);
	  
  }
  static void Add(String a)  //static method
  {   
	  System.out.println("3");
	  System.out.println(a);
	  
  }
   static void Add(String a, char b,double c) //static method
  {
	 System.out.println("4");
	 System.out.println(a);
	 System.out.println(b);
	 System.out.println(c);
	 
	 
	 
  }
   static  void Add(boolean a)
   {
	  System.out.println(a); 
   }
 
  public static void main(String arg[])
  {
	  Add();
	 
	  Add("Swati");
	  Add("Swati",'S',10.23);
	  
	  MethodOverloading mobj = new MethodOverloading();
	  mobj.Add(20);
	  Add(true);
	   
	  
	  
  } 
}
