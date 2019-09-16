package Assignment;

interface A
{
    void disp1();
}	

interface B extends A
{
	 void disp2();
}

class C implements B
{
	public void disp2()
	{
		System.out.println("in disp2");
	}
	public void disp1()
	{
		System.out.println("in disp1");
	}
	public void disp3()
	{
		System.out.println("in disp3");
	}

	
}

public class DemoInterface
{
	 public static void main (String args[])
	 {
		 C c1=new C();
		 c1.disp1();
		 c1.disp2();
		 c1.disp3();
		 
		 
	 }

}
