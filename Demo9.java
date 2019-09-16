package Assignment;
interface Game
{
	abstract void play();
}
class football implements Game{
	
	public void play()
	{
		System.out.println("football");
		
	}
}
class cricket implements Game{
	
	public void play()
	{
		System.out.println("cricket");
		
	}
}

class tennis implements Game{
	
	public void play()
	{
		System.out.println("tennis");
		
	}
}

public class Demo9 {

		// TODO Auto-generated method stub
		static void perform(Game ref)
		{
			ref.play();
			
		}
	
		public static void main(String[] args) {

			perform(new cricket());
			perform(new football());
			perform(new tennis());

}
}