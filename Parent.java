package Assignment;

class Parent1
{
		void disp1() {
			
		System.out.println("in Parent 1");
}
}
interface Parent2
{
	  void disp2() ;
		
}
		
class Child extends Parent1 implements Parent2
{	
		public void disp1()
		{
			System.out.println("p1");

        }

	public void disp2()
	{
		System.out.println("p2");
	}
}
public class Parent {

	public static void main(String[] args) 
	{
      Child c = new Child();
      c.disp1();
      c.disp2();
	}

}
