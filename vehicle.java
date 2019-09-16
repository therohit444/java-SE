package Assignment;

class vehicle1
{
	public void start()
	{
		System.out.println("in vehicle");
	}
	
	vehicle1()
	{
		System.out.println("vehicle const");
	}
}
	
	 class fourwheeler extends vehicle1
	{
		public void start()
		{
			System.out.println("in fourwheeler");
		}
		
		fourwheeler()
		{
			System.out.println("fourwheeler const");
		}
	}
	 
	 public class vehicle
	 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           vehicle1 v=new vehicle1();
           v.start();
           fourwheeler f=new fourwheeler();
           f.start();
	}

	 }
