package Assignment;

class base2 
{
	int a;
	int b;
	base2(int a)
	{
		this.a=a;
		System.out.println("in base2 constructor");
	}

}
class sub2 extends base2
{

	sub2(int a) 
	{
		super(20);
		this.a=a;
		System.out.println("in sub2 one arg constructor");

	}
	sub2()
	{	super(20);
		System.out.println("in sub2 default constructor");
	}
	
	sub2(int a,int b)
	{	super(20);
		this.a=a;
		this.b=b;
		System.out.println("in sub2 two parameterised constructor");
	}
	
}
public class base1
{
		public static void main(String args[])
	{
		sub2 s2 = new sub2(5,6);	
		
	}
}
	
	

