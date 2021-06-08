import java.util.*;
class InvalidAgeException extends Exception
{
		public InvalidAgeException()
		{
				super();
			
		}
}

class TestAge
{
	public static void main(String args[])
	{
		int age;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter ur age");
		age = sc.nextInt();
		
		try
			{
				if (age<0 || age>100)
				
				throw new InvalidAgeException();
			}
			catch (InvalidAgeException e)
			{
				System.out.println("you are too old or too small in this category");
			}
	}
}