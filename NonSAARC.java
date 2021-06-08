import java.util.*;
class NonSAARCException extends Exception
{
	public NonSAARCException(String s)
	{
		super(s);
	}
}
class TestNon
{
	public static void main(String[] args) 
	{		
		String rb[] = { "afganistan", "bangladesh", "bhutan", "india", "nepal", "srilanka", "maldives","pakistan"};
		List<String> list = Arrays.asList(rb);

		String c, s;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a country : ");
		c = sc.next();
		s = c.toLowerCase();

		try
		{
			if (list.contains(s))
			{
				System.out.print("Country entered is "+c+" and it is a SAARC country");
			}else
			{
				throw new NonSAARCException("Entered country is not a SAARC country");
			}
		}catch (NonSAARCException e)
		{
			System.out.println(e.toString());
		}
	}
}