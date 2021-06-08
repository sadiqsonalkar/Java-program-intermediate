import java.util.*;
class NonRainbowColour extends Exception
{
	public NonRainbowColour(String s)
	{
		super(s);
	}
}
class TestColor
{
	public static void main(String[] args) 
	{		
		String rb[] = { "violet", "indigo", "blue", "yellow", "green", "orange", "red"};
		List<String> list = Arrays.asList(rb);
		String c, s;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a colour : ");
		c = sc.next();
		s = c.toLowerCase();

		try
		{
			if (list.contains(s))
			{
				System.out.print("Colour entered is "+c+" and it is a rainbow colour");
			}else
			{
				throw new NonRainbowColour("Entered colour is not a Rainbow Colour");
			}
		}catch (NonRainbowColour e)
		{
			System.out.println(e.toString());
		}
	}
}