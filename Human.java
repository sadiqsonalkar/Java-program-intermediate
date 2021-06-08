import java.util.*;
abstract class Human

	{
		abstract void action();
	}
	
	class child extends Human
	{
		void action()
		{
			System.out.println("CHILD:::sleep");
		}
	}
	
	class Teenage extends Human
	{
		void action()
		{
			System.out.println("TEENAGE:::studies");
		}
	}
	
	class adult extends Human
	{
		void action()
		{
			System.out.println("ADULT:::work");
		}
	}
	
	class TestHuman
	{
		public static void main(String args[])
		{
			child c=new child();
			c.action();
			Teenage t=new Teenage();
			t.action();
			adult a=new adult();
			a.action();
		}
	}