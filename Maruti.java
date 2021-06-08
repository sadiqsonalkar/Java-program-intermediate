import java.util.*;
abstract class Maruti

	{
		abstract void Maruti();
	}
	
	class Zen extends Maruti
	{
		void Maruti()
		{
			System.out.println("Car : Maruti Zen");
		}
	}
	
	class Swift extends Maruti
	{
		void Maruti()
		{
			System.out.println("Car : Maruti Swift");
		}
	}
	
	class WagonR extends Maruti
	{
		void Maruti()
		{
			System.out.println("car : Maruti WagonR");
		}
	}
	
	class Test
	{
		public static void main(String args[])
		{
			Zen a=new Zen();
			a.Maruti();
			Swift b=new Swift();
			b.Maruti();
			WagonR c=new WagonR();
			c.Maruti();
		}
	}