import java.util.*;
class InvalidMarksException extends Exception
{
		public InvalidMarksException()
		{
				super();
			
		}
}

class Test
{
	public static void main(String args[])
	{
		int marks;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your Marks");
		marks = sc.nextInt();
		
		try
			{
				if (marks<0 || marks>100)
				
				throw new InvalidMarksException();
			}
			catch (InvalidMarksException e)
			{
				System.out.println("you are either not capable or too smart");
			}
	}
}