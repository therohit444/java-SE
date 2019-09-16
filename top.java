package Assignment;


class Top1
{
	void disp()
	{
		System.out.println("in top");
	}
}
	
	class bottom1 extends Top1
	{
		void disp()
		{
			System.out.println("in bottom1");
		}
	}
	
	class bottom2 extends Top1
	{
		void disp()
		{
			System.out.println("in bottom 2");
		}
	}
	class bottom3 extends Top1
	{
		void disp()
		{
			System.out.println("in bottom 3");
		}
	}

public class top {
	
	public static void main(String args[])
	{
		bottom2 b2 = new bottom2();
		b2.disp();
		bottom3 b3 = new bottom3();
		b3.disp();
		bottom1 b1 = new bottom1();
		b1.disp();
	}

}
