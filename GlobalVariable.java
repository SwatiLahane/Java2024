package firstpackage;

public class GlobalVariable 
{
    
	static int a = 10;
	static int b = 20;
	static int c = 30;
	
	static void Add()
	{
		int a = 90; //local 
		System.out.println(a+b);
	}
	static void Sub()
	{
		System.out.println(b-a);
	}
	static void Multi()
	{
		System.out.println(a*b);
	}
    public static void main(String arg[])
    {
       	Add();
       	Sub();
       	Multi();
    }
}
